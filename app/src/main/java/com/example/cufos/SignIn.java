package com.example.cufos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignIn extends AppCompatActivity {
    EditText emailET, passwordET;
    Button loginBtn;

    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView9;
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sign_in);
        emailET = findViewById (R.id.emailET);
        passwordET = findViewById (R.id.passwordET);
        loginBtn = findViewById (R.id.loginBtn);
        auth = FirebaseAuth.getInstance ();
        textView9 = findViewById (R.id.textView9);
        loginBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                String email = emailET.getText ().toString ();
                String password = passwordET.getText ().toString ();

                auth.signInWithEmailAndPassword (email, password).addOnCompleteListener (new OnCompleteListener<AuthResult> () {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful ()) {
                            Intent intent = new Intent (SignIn.this, MainActivity.class);
                            startActivity (intent);
                            Toast.makeText (SignIn.this, "Successfully Login", Toast.LENGTH_SHORT).show ();
                        } else {
                            Toast.makeText (SignIn.this, "Error", Toast.LENGTH_SHORT).show ();
                        }

                    }
                });
            }
        });


        textView9.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (SignIn.this, SignUp.class);
                startActivity (intent);
            }
        });
    }
}