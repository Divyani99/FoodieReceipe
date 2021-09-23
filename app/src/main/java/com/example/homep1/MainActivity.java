package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.homep1.R;

public class MainActivity extends AppCompatActivity {
    Animation topAnim, bottomanim;
    ImageView image;
    TextView logo, slogan;


    private static int SPLASH_SCREEN=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Animation
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomanim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        //Hooks
        image = findViewById(R.id.iv1);
        logo = findViewById(R.id.txt2);
        slogan = findViewById(R.id.txt1);

        logo.setAnimation(bottomanim);
        slogan.setAnimation(bottomanim);
        image.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent hIntent=new Intent(MainActivity.this,StartSlider.class);
                startActivity(hIntent);
                finish();

            }
        },SPLASH_SCREEN);

    }
}
