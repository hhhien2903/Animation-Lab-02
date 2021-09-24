package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        ImageView light_lavender = (ImageView) findViewById(R.id.imageView);
        ImageView lavender = (ImageView) findViewById(R.id.imageView2);
        ImageView lavender_3 = (ImageView) findViewById(R.id.imageView7);
        ImageView lavender_4 = (ImageView) findViewById(R.id.imageView8);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        light_lavender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Activity2.this,
                        Activity3.class);

                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                Activity2.this, light_lavender,
                                ViewCompat.getTransitionName(light_lavender));


                Bundle b = new Bundle();
                b.putInt("imageId", R.drawable.lavender);
                b.putString("content", "The word “carnival” derives from the Latin “carnelevare” meaning “to take out the meat”. The medieval Church banished meat from the table during the whole period of Lent, as it did with sugar, ingredients containing fat, eggs and dairy products. ");
                intent.putExtras(b);
                startActivity(intent, options.toBundle());
            }
        });

        lavender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on image click we are opening new activity
                // and adding animation between this two activities.
                Intent intent = new Intent(Activity2.this,
                        Activity3.class);
                // below method is used to make scene transition
                // and adding fade animation in it.
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                Activity2.this, lavender,
                                ViewCompat.getTransitionName(lavender));
                // starting our activity with below method.

                Bundle b = new Bundle();
                b.putInt("imageId", R.drawable.lavender2);
                b.putString("content", "Before the start of the fasting period of Lent (on Ash Wednesday), people had fun running Carnivals as it was their last chance until Easterto eat meat. The celebration was also a way to chase off the gloom of winter in the hope of spring.");
                intent.putExtras(b);
                startActivity(intent, options.toBundle());
            }
        });

        lavender_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Activity2.this,
                        Activity3.class);

                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                Activity2.this, lavender_3,
                                ViewCompat.getTransitionName(lavender_3));


                Bundle b = new Bundle();
                b.putInt("imageId", R.drawable.lavender);
                b.putString("content", "The word “carnival” derives from the Latin “carnelevare” meaning “to take out the meat”. The medieval Church banished meat from the table during the whole period of Lent, as it did with sugar, ingredients containing fat, eggs and dairy products. ");
                intent.putExtras(b);
                startActivity(intent, options.toBundle());
            }
        });

        lavender_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on image click we are opening new activity
                // and adding animation between this two activities.
                Intent intent = new Intent(Activity2.this,
                        Activity3.class);
                // below method is used to make scene transition
                // and adding fade animation in it.
                ActivityOptionsCompat options =
                        ActivityOptionsCompat.makeSceneTransitionAnimation(
                                Activity2.this, lavender_4,
                                ViewCompat.getTransitionName(lavender_4));
                // starting our activity with below method.

                Bundle b = new Bundle();
                b.putInt("imageId", R.drawable.lavender2);
                b.putString("content", "Before the start of the fasting period of Lent (on Ash Wednesday), people had fun running Carnivals as it was their last chance until Easterto eat meat. The celebration was also a way to chase off the gloom of winter in the hope of spring.");
                intent.putExtras(b);
                startActivity(intent, options.toBundle());
            }
        });
    }

}
