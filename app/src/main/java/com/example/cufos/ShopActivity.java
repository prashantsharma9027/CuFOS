package com.example.cufos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ShopActivity extends AppCompatActivity {
    ImageView Paratha,Punjabi,Corner,Creative,Samosa,Fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_shop);
        Paratha = findViewById (R.id.Paratha);
        Punjabi = findViewById (R.id.Punjabi);
        Corner = findViewById (R.id.Corner);
        Creative = findViewById (R.id.Creative);
        Samosa = findViewById (R.id.Samosa);
        Fr = findViewById (R.id.Fr);

        Paratha.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ShopActivity.this, ParathaActivity.class);
                startActivity (intent);
            } });
        Punjabi.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent intent = new Intent (ShopActivity.this, PunjabiActivity.class);
                startActivity (intent);
            } });
        Corner.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ShopActivity.this, CornerActivity.class);
                startActivity (intent);
            } });
        Creative.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent intent = new Intent (ShopActivity.this, CreativeActivity.class);
                startActivity (intent);
            }});
        Samosa.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ShopActivity.this, SamosaActivity.class);
                startActivity (intent);
            }
        });
        Fr.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (ShopActivity.this, FrActivity.class);
                startActivity (intent);
            }
        });



    }
}