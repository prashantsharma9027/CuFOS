package com.example.cufos;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.cufos.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class CreativeActivity extends AppCompatActivity {

    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.cr1 ,   " Kadhai Chicken" , "150" , " delicious, spicy & flavorful dish made with chicken, onions, tomatoes, ginger, garlic & fresh ground spices"));
        list.add(new MainModel(R.drawable.cr2 ,   " Paneer butter masala " , "170" , "loaded with butter with masala gravey"));
        list.add(new MainModel(R.drawable.cr3,   " Chicken Briyani" , "100" , "layering marinated chicken with rice"));
        list.add(new MainModel(R.drawable.cr4 ,   "Tandoori Chicken " , "140" , "Hot and Spicy baked chicken"));
        list.add(new MainModel(R.drawable.cr5 ,   "Seekh Kabab" , "90" , " skewers and 'kebab' means meat cooked over a charcoal fire "));
        list.add(new MainModel(R.drawable.cr6 ,   "chicken Tikka Masala" , "150" , " consisting of roasted marinated chicken chunks (chicken tikka) in spiced curry sauce."));
        list.add(new MainModel(R.drawable.cr7 ,   "Chicken Tikka" , "150" , "boneless chicken pieces are marinated with yogurt"));
        list.add(new MainModel(R.drawable.cr8 ,   "Mutton Briyani" , "150" , "Spicy Mutton Briyani with raita"));
        list.add(new MainModel(R.drawable.cr9 ,   " Mutton Corma" , "300" , "Mutton with Spicy and sweet gravey "));

        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}