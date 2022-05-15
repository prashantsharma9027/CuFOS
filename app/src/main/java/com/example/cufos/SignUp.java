package com.example.cufos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {
    EditText emailET,passwordET,userNameET,phoneET;
    Button signupBtn;

    FirebaseAuth auth;
    FirebaseDatabase database;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        emailET = findViewById(R.id.emailET);
        passwordET = findViewById(R.id.passwordET);
        userNameET = findViewById(R.id.userNameET);
        phoneET = findViewById(R.id.phoneET);
        signupBtn = findViewById(R.id.signupBtn);

        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailET.getText().toString(), password = passwordET.getText().toString();
                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            User user = new User(userNameET.getText().toString(),email,phoneET.getText().toString(),password);
                            String id = task.getResult().getUser().getUid();
                            database.getReference().child("Users").child(id).setValue(user);
                            Intent intent = new Intent(SignUp.this,MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(SignUp.this, "User Data Saved", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(SignUp.this, "Error", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}
