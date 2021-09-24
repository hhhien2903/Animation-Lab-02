package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {
    private ImageView img;
    private TextView txtContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Bundle extras = getIntent().getExtras();


        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
//
        // here also we are excluding status bar,
        // action bar and navigation bar from animation.
        fade.excludeTarget(decor.findViewById(R.id.action_bar_container), true);
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);

        // below methods are used for adding    // enter and exit transition.
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);
        this.img= (ImageView) findViewById(R.id.imageView4);
        img.setImageResource(extras.getInt("imageId"));
        this.txtContent = (TextView) findViewById(R.id.textView4);
        txtContent.setText(extras.getString("content"));

    }
}
