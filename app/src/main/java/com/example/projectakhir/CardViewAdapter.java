package com.example.projectakhir;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {


    public CardViewAdapter(Context mccontext) {
        this.mccontext = mccontext;
    }

    public Context mccontext;
    private ArrayList<Leanguage> listbahasa;
    public CardViewAdapter(ArrayList<Leanguage> list){
        this.listbahasa=list;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, final int position) {
        final Leanguage leanguage= listbahasa.get(position);
        Glide.with(holder.itemView.getContext())
                .load(leanguage.getImage())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgphoto);
        holder.tv_name.setText(leanguage.getNama());
        holder.tv_detail.setText(leanguage.getDetail());
        holder.btn_fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(),"Favorite"+listbahasa.
                        get(holder.getAdapterPosition()).getNama(),Toast.LENGTH_SHORT).show();

            }
        });
        holder.btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(),"Share"+listbahasa.
                        get(holder.getAdapterPosition()).getNama(),Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), String.format("Kamu Memilih%s", listbahasa.
                        get(holder.getAdapterPosition()).getNama()),Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(holder.itemView.getContext(),Detail_act.class);
                intent.putExtra("nama",leanguage.getNama());
                intent.putExtra("detail",leanguage.getDetail());
                intent.putExtra("images", leanguage.getImage());
                holder.itemView.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listbahasa.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgphoto;
        TextView tv_name,tv_detail;
        Button btn_fav, btn_share;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgphoto=itemView.findViewById(R.id.img_item_photo);
            tv_detail=itemView.findViewById(R.id.tv_item_detail);
            btn_fav=itemView.findViewById(R.id.btn_set_favorite);
            btn_share=itemView.findViewById(R.id.btn_set_share);
            tv_name=itemView.findViewById(R.id.tv_item_name);
        }
    }
}
