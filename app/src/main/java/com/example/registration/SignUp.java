package com.example.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {
    AppCompatButton b1,b2;
    EditText e1,e2,e5,e6,e7,e8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        e1=(EditText) findViewById(R.id.uname);
        e2=(EditText) findViewById(R.id.age);
        e5=(EditText) findViewById(R.id.mob);
        e6=(EditText) findViewById(R.id.pswrd);
        e7=(EditText) findViewById(R.id.confirm);
        e8=(EditText) findViewById(R.id.username);
        b1=(AppCompatButton) findViewById(R.id.regibtn);
        b2=(AppCompatButton) findViewById(R.id.backbtn);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getuname=e1.getText().toString();
                String getage=e2.getText().toString();
                String getmob=e5.getText().toString();
                String getpswrd=e6.getText().toString();
                String getconfirm=e7.getText().toString();
                String getuser=e8.getText().toString();

                Toast.makeText(getApplicationContext(),getuname+" "+getage+" "+getmob+" "+getuser+" "+getpswrd+" "+getconfirm,Toast.LENGTH_LONG).show();

            }
        });
    }
}