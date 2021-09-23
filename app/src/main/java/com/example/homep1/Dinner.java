package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
    }

    public void dalpakwan(View view) {
        Intent i=new Intent(Dinner.this,DalPakwan.class);
        startActivity(i);
    }

    public void paneerbutter(View view) {
        Intent i=new Intent(Dinner.this,PaneerButter.class);
        startActivity(i);
    }

    public void chickenspringrolls(View view) {
        Intent i=new Intent(Dinner.this,ChickenSpringRolls.class);
        startActivity(i);

    }

    public void springonion(View view) {
        Intent i=new Intent(Dinner.this,SpringOnion.class);
        startActivity(i);
    }

    public void aloobhindi(View view) {
        Intent i=new Intent(Dinner.this,AlooBhindi.class);
        startActivity(i);

    }

    public void palakpulao(View view) {
        Intent i=new Intent(Dinner.this,PalakPulao.class);
        startActivity(i);
    }
}
