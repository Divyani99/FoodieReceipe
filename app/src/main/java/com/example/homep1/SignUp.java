package com.example.homep1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.material.textfield.TextInputEditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    DatabaseHelper db;
    EditText Name;
    EditText UserName;
    EditText Pass;
    EditText ConPass;
    Button B1;
    Button B2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        db = new DatabaseHelper(this);
      Name = (EditText) findViewById(R.id.Fname);
        UserName = (EditText) findViewById(R.id.lname);
        Pass = (EditText) findViewById(R.id.pass);
        ConPass = (EditText) findViewById(R.id.cpass);


        B1 = (Button) findViewById(R.id.signup);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String FN = Name.getEditableText().toString();
                String LN = UserName.getEditableText().toString();
                String PS = Pass.getEditableText().toString();
                String CP = ConPass.getEditableText().toString();


                if (PS.equals(CP)) {
                    long val = db.addUser(FN, LN, PS, CP);
                    if (val > 0) {
                        Toast.makeText(SignUp.this, "You Have Registered", Toast.LENGTH_SHORT).show();
                        Intent mvLogin = new Intent(SignUp.this, LoginPage.class);
                        startActivity(mvLogin);
                    } else {
                        Toast.makeText(SignUp.this, "You Have Not Registered", Toast.LENGTH_SHORT).show();
                    }


                } else {
                    Toast.makeText(SignUp.this, "Password id not Matching", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}








