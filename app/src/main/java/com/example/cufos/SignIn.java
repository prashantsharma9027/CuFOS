package com.example.cufos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView9;
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_sign_in);
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