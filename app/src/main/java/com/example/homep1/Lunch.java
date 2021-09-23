package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
    }

    public void kadhiclick(View view) {
        Intent i=new Intent(Lunch.this,KadhiPakora.class);
        startActivity(i);
    }

    public void cholebhatureclick(View view) {
        Intent i=new Intent(Lunch.this,CholeBature.class);
        startActivity(i);
    }

    public void bhindiclick(View view) {
        Intent i=new Intent(Lunch.this,BhindiTambuli.class);
        startActivity(i);
    }

    public void cholemasalaclick(View view) {
        Intent i=new Intent(Lunch.this,CholeMasala.class);
        startActivity(i);
    }

    public void soyachapclick(View view) {
        Intent i=new Intent(Lunch.this,SoyaChaapaCurry.class);
        startActivity(i);
    }
}
