package com.example.animation_shareelement_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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

        arrayList= new ArrayList<>();
        for (int i=0;i<=8;i++){
            arrayList.add(new Singer("Love Story","Taylor Swift",R.drawable.taylorsmall));
        }

        recyclerView=findViewById(R.id.recyclerView);
        singerAdapter=new SingerAdapter(arrayList,this);
        recyclerView.setAdapter(singerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GridLayoutManager layoutManager= new GridLayoutManager(MainActivity.this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
    }
}