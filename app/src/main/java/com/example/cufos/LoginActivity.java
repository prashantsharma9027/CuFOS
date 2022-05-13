package com.example.cufos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
 Button btnlogin , btnSignup;
 TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_login2);
        btnlogin = findViewById (R.id.btnlogin);
        btnSignup = findViewById (R.id.btnSignup);
textView2 = findViewById (R.id.textView2);
        btnlogin.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (LoginActivity.this , SignIn.class);
                startActivity (intent);
            }
        });
        btnSignup.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (LoginActivity.this , SignUp.class);
                startActivity (intent);
            }
        });
        textView2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (LoginActivity.this , MainActivity.class);
                startActivity (intent);
            }
        });
    }
}