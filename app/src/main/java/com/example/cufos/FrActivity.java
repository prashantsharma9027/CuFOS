package com.example.cufos;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.cufos.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class FrActivity extends AppCompatActivity {

    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.frr1,   "peri peri pizza" , "200" , "Spicy Flavour with some veggies"));
        list.add(new MainModel(R.drawable.fr2 ,   "Margherita " , "170" , "Loaded with extra cheese with 600ml coke"));
        list.add(new MainModel(R.drawable.fr3 ,   "Stuffed Garlic Bread" , "100" , "This herby, garlicky bread is stuffed with a succulent cheesy filling"));
        list.add(new MainModel(R.drawable.fr4 ,   "Mexican pasta" , "120" , "Pasta tossed with a quickly cooked sauce of tomatoes, onion, bell pepper, corn, black beans, salsa and taco seasoning."));
        list.add(new MainModel(R.drawable.fr5 ,   "Choco Lava Cake" , "50" , "Loaded with Chocolate "));
        list.add(new MainModel(R.drawable.fr6 ,   "Brownie" , "70" , "They are rich, fudgy in the middle, and made completely from scratch"));
        list.add(new MainModel(R.drawable.fr7 ,   "Peri Peri fries" , "40" , "potato fries with some spicy peri peri flovour"));
        list.add(new MainModel(R.drawable.fr8 ,   "Cheese fries" , "50" , "cheese loaded fires with coke"));
        list.add(new MainModel(R.drawable.fr9 ,   "Chicken Nugget" , "100" , "small piece of deboned chicken meat that is breaded or battered"));
        list.add(new MainModel(R.drawable.fr10 ,   "Loaded nachos" , "70" , "nicely baked tortilla chips which are topped with refried beans, black beans, corn kernels, guacamole"));


        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}