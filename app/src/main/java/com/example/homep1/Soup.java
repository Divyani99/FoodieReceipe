package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Soup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup);
    }

    public void roastedgarlicsoup(View view) {
        Intent i=new Intent(Soup.this,RoastedGarlicSoup.class);
        startActivity(i);
    }

    public void wontonsoup(View view) {
        Intent i=new Intent(Soup.this,WontonSoup.class);
        startActivity(i);
    }

    public void chickenmacaroni(View view) {
        Intent i=new Intent(Soup.this,ChickenMacaroni.class);
        startActivity(i);
    }

    public void paneermomosoup(View view) {
        Intent i=new Intent(Soup.this,PaneerMomoSoup.class);
        startActivity(i);

    }

    public void tomatosoup(View view) {
        Intent i=new Intent(Soup.this,TomatoSoup.class);
        startActivity(i);
    }
}
