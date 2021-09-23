package com.example.homep1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ImageView imageView1=(ImageView)findViewById(R.id.img1);
        ImageView imageView2=(ImageView)findViewById(R.id.img2);
        ImageView imageView3=(ImageView)findViewById(R.id.img3);
        ImageView imageView4=(ImageView)findViewById(R.id.img4);
        ImageView imageView5=(ImageView)findViewById(R.id.img5);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,BreakFast .class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, Lunch.class);
                startActivity(intent);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(HomePage.this,Dinner.class);
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(HomePage.this,Soup.class);
                startActivity(intent);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(HomePage.this,Dessert.class);
                startActivity(intent);
            }
        });
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.FavoriteM:
                        startActivity(new Intent(getApplicationContext(), Favorite.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.HomeM:
                        startActivity(new Intent(getApplicationContext(), HomePage.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.videoM:
                        startActivity(new Intent(getApplicationContext(),FoodieVideo.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
}




