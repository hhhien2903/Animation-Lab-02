package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SingerAdapter extends RecyclerView.Adapter<SingerAdapter.SingerViewHolder> {
    private ArrayList<Singer> mSingerList;
    private LayoutInflater mInflater;
    private Context context;
    @NonNull
    @Override
    public SingerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        SingerViewHolder svh=new SingerViewHolder(view);
        return svh;
    }

    public SingerAdapter(ArrayList<Singer> mSingerList, Context context) {
        mInflater = LayoutInflater.from(context);
        this.mSingerList = mSingerList;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(@NonNull SingerViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Singer singer= mSingerList.get(position);
        holder.txtSinger.setText(singer.getTxtSinger());
        holder.txtName.setText(singer.getTxtName());
        holder.imgHinh.setImageResource(singer.getImgHinh());
        holder.singer = singer;
        holder.position = position;

    }

    @Override
    public int getItemCount() {
        return mSingerList.size();
    }

    public class SingerViewHolder extends RecyclerView.ViewHolder {
        public TextView txtName;
        public TextView txtSinger;
        public ImageView imgHinh;
        public Singer singer;
        public int position;
        public SingerViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.txtName);
            txtSinger=itemView.findViewById(R.id.txtSinger);
            imgHinh=itemView.findViewById(R.id.imgHinh);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int mPosition=getLayoutPosition();
                    Intent i=new Intent(context, PlayActivity.class);
//                    i.putExtra("txtName",singer.getTxtSinger());
//                    i.putExtra("txtSinger",singer.getTxtSinger());
//                    i.putExtra("imgHinh",singer.getImgHinh());
                    ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                            (Activity) context, imgHinh, imgHinh.getTransitionName());
                    context.startActivity(i, options.toBundle());
                }
            });
        }

    }
}
