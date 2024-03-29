package com.example.cufos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView ff, shakes, thali4, ice, nv , prantha , juice , imageViewProfile,imageViewShops,imageViewSupport;
    ImageView cartBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        ff = findViewById (R.id.ff);
        shakes = findViewById (R.id.shakes);
        thali4 = findViewById (R.id.thali4);
        ice = findViewById (R.id.ice);
        nv = findViewById (R.id.nv);
        prantha = findViewById (R.id.prantha);
        juice = findViewById (R.id.juice);
        imageViewProfile = findViewById (R.id.imageViewProfile);
        imageViewShops = findViewById (R.id.imageViewShops);
        imageViewSupport = findViewById (R.id.imageViewSupport);
        cartBtn = findViewById (R.id.cartBtn);


        ff.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MainActivity.this, PunjabiActivity.class);
                startActivity (intent);
            } });
            shakes.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View view){
                Intent intent = new Intent (MainActivity.this, SamosaActivity.class);
                startActivity (intent);
            } });
                thali4.setOnClickListener (new View.OnClickListener () {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent (MainActivity.this, CornerActivity.class);
                        startActivity (intent);
                    } });
                    ice.setOnClickListener(new View.OnClickListener()

                    {
                        @Override
                        public void onClick (View view){
                        Intent intent = new Intent (MainActivity.this, PunjabiActivity.class);
                        startActivity (intent);
                    }});
                        nv.setOnClickListener (new View.OnClickListener () {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent (MainActivity.this, CreativeActivity.class);
                                startActivity (intent);
                            }
                        }); prantha.setOnClickListener (new View.OnClickListener () {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent (MainActivity.this, ParathaActivity.class);
                                startActivity (intent);
                            }
                        }); juice.setOnClickListener (new View.OnClickListener () {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent (MainActivity.this, SamosaActivity.class);
                                startActivity (intent);
                            }
                        });
                        imageViewProfile.setOnClickListener (new View.OnClickListener () {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent (MainActivity.this, LoginActivity.class);
                                startActivity (intent);
                            }
                        });
                        imageViewShops.setOnClickListener (new View.OnClickListener () {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent (MainActivity.this, ShopActivity.class);
                                startActivity (intent);
                            }
                        });
                        imageViewSupport.setOnClickListener (new View.OnClickListener () {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent (MainActivity.this, SupportActivity.class);
                                startActivity (intent);
                           }
                        });
                        cartBtn.setOnClickListener (new View.OnClickListener () {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent (MainActivity.this, AddcartActivity.class);
                                startActivity (intent);
                            }
                         });

                    }
                }