package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class PlayMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_music);


        final ImageView imgHinhPlay= findViewById(R.id.imgHinhPlay);
        imgHinhPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayMusic.this,LyricMusic.class);

                ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(
                        PlayMusic.this,imgHinhPlay,
                        ViewCompat.getTransitionName(imgHinhPlay)
                );
                startActivity(intent, optionsCompat.toBundle());
            }
        });


    }
}