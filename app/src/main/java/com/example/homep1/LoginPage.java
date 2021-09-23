package com.example.homep1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    Button Log;
    DatabaseHelper db;
    Button Sign;
    EditText User;
    EditText Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        db = new DatabaseHelper(this);
        User = (EditText) findViewById(R.id.user);
        Pass = (EditText) findViewById(R.id.pwd);
        Log = (Button) findViewById(R.id.login);
        Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String U = User.getEditableText().toString();
                String P = Pass.getEditableText().toString();
                boolean log = db.checkUser(U,P);
                if (log == true) {
                    Intent LoginAct = new Intent(LoginPage.this, HomePage.class);
                    startActivity(LoginAct);

                } else {
                    Toast.makeText(LoginPage.this, "Error in Login", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    public void skipclick(View view) {
        Intent i = new Intent(getApplicationContext(), HomePage.class);
        startActivity(i);
    }

    public void signup(View view) {
        Intent i = new Intent(getApplicationContext(), SignUp.class);
        startActivity(i);
    }
}