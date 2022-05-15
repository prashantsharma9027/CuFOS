package com.example.cufos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SignIn extends AppCompatActivity {
    EditText emailET,passwordET;
    Button loginBtn;

    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView9;
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sign_in);
        emailET = findViewById(R.id.emailET);
        passwordET = findViewById(R.id.passwordET);
        loginBtn = findViewById(R.id.loginBtn);
        auth = FirebaseAuth.getInstance();
        textView9 =findViewById (R.id.textView9);

        textView9.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (SignIn.this, SignUp.class);
                startActivity (intent);
            }
        });
    }
}