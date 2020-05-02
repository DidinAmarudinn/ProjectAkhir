package com.example.projectakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_leanguage;
    private ArrayList<Leanguage> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_leanguage=findViewById(R.id.tv_leangueage);
        rv_leanguage.setHasFixedSize(true);
        list.addAll(data.getListData());
        showRecyclerList();

    }
    private void showRecyclerList(){
        rv_leanguage.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cardViewAdapter= new CardViewAdapter(list);
        rv_leanguage.setAdapter(cardViewAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        setMode(menuItem.getItemId());
        return super.onOptionsItemSelected(menuItem);
    }
    public void setMode(int itemid){
        switch (itemid){
        case R.id.miProfile:
            showAbout();
        break;
    }
    }
    public void showAbout(){
        Intent about=new Intent(MainActivity.this,profil_act.class);
        startActivity(about);
    }




}
