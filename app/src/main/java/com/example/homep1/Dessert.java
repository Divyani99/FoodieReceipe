package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dessert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
    }

    public void hotchoclate(View view) {
        Intent i=new Intent(Dessert.this,HotChoclate.class);
        startActivity(i);
    }

    public void mangovanillapudding(View view) {
        Intent i=new Intent(Dessert.this,MangoVanillaPudding.class);
        startActivity(i);
    }

    public void swissrollinpan(View view) {
        Intent i=new Intent(Dessert.this,SwissRollInnPan.class);
        startActivity(i);

    }

    public void choclatebanacake(View view) {
        Intent i=new Intent(Dessert.this,ChoclateBananaCake.class);
        startActivity(i);
    }


    public void pkclick(View view) {
        Intent i=new Intent(Dessert.this,PaneerKheer.class);
        startActivity(i);
    }
}
