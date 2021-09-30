package com.example.animation_shareelement_recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
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
    public void onBindViewHolder(@NonNull SingerViewHolder holder, int position) {
        Singer singer=mSingerList.get(position);
        holder.txtSinger.setText(singer.getTxtSinger());
        holder.txtName.setText(singer.getTxtName());
        holder.imgHinh.setImageResource(singer.getImgHinh());
    }

    @Override
    public int getItemCount() {
        return mSingerList.size();
    }

    public class SingerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtName;
        public TextView txtSinger;
        public ImageView imgHinh;
        public SingerViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName=itemView.findViewById(R.id.txtName);
            txtSinger=itemView.findViewById(R.id.txtSinger);
            imgHinh=itemView.findViewById(R.id.imgHinh);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int mPosition=getLayoutPosition();
            Singer s= mSingerList.get(mPosition);
            Intent i=new Intent(context,PlayMusic.class);
            i.putExtra("txtName",s.getTxtName());
            i.putExtra("txtSinger",s.getTxtSinger());
            i.putExtra("imgHinh",s.getImgHinh());
            context.startActivity(i);
        }
    }
}
