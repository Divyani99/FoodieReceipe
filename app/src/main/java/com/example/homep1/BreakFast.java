package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BreakFast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_view);
    }

    public void noodleclick(View view) {
        Intent i=new Intent(BreakFast.this,Noodle_Manchrian_Frankie.class);
        startActivity(i);
    }

    public void tricolourclick(View view) {
        Intent i=new Intent(BreakFast.this,TricolourPaneerTikka.class);
        startActivity(i);
    }

    public void chickenspringrolls(View view) {
        Intent i=new Intent(BreakFast.this,ChickenSpringRolls.class);
        startActivity(i);
    }



    public void paneerandcornchapata(View view) {
        Intent i=new Intent(BreakFast.this,PaneerCornChapataSalad.class);
        startActivity(i);
    }

    public void cornveg(View view) {
        Intent i = new Intent(BreakFast.this,CornVegCutlet.class);
        startActivity(i);
    }
}
