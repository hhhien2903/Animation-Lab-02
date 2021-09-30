package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SingerAdapter singerAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Singer> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        arrayList= new ArrayList<>();
        for (int i=0;i<=8;i++){
            arrayList.add(new Singer("Love Story","Taylor Swift",R.drawable.tayler));
        }

        recyclerView=findViewById(R.id.recyclerView);
        singerAdapter=new SingerAdapter(arrayList,this);
        recyclerView.setAdapter(singerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GridLayoutManager layoutManager= new GridLayoutManager(MainActivity.this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
    }
}