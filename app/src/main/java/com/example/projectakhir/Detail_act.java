package com.example.projectakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail_act extends AppCompatActivity {
    TextView tvname,tvdetail;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_act);
        tvdetail=findViewById(R.id.tv_item_detail);
        tvname=findViewById(R.id.tv_item_name);
        img=findViewById(R.id.img_item_photo);

        String detail=getIntent().getExtras().getString("detail");
        String name=getIntent().getExtras().getString("nama");
        int imge=getIntent().getExtras().getInt("images");

        tvdetail.setText(detail);
        tvname.setText(name);
        img.setImageResource(imge);
    }

}
