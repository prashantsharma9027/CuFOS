package com.example.cufos;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.cufos.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class ParathaActivity extends AppCompatActivity {

    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.paratha1,   "Aalu Paratha" , "20" , "Stuffed aalo paratha with green dhaniya chutney"));
        list.add(new MainModel(R.drawable.pan ,   "paneer Paratha" , "20" , "Made with a spicy, fresh, moist and soft paneer stuffing inside it"));
        list.add(new MainModel(R.drawable.go ,   "Gobhi Paratha" , "20" , "A much loved stuffed Indian flatbread, Gobi (Cauliflower) paratha is a staple dish in most North india"));
        list.add(new MainModel(R.drawable.omle ,   "Egg omlette" , "40" , "Egg Omlette with Some Onion and chutney"));
        list.add(new MainModel(R.drawable.dahi ,   "Simple Paratha" , "20" , "Simple Paratha with dahi. "));
        list.add(new MainModel(R.drawable.egg ,   "Egg Roll" , "40" , "shredded cabbage, chopped pork, and other fillings inside a thickly-wrapped wheat flour"));
        list.add(new MainModel(R.drawable.chick ,   "Chicken Roll" , "10" , "Filling of small pieces of chicken in a wrapped roll"));
        list.add(new MainModel(R.drawable.bhurji ,   "egg bhurji" , "35" , "Scrambelled egg with vegetables"));
        list.add(new MainModel(R.drawable.frie ,   "Fried Rice" , "50" , "A deliciously aromatic and flavorful dish prepared from rice and stir-fried vegetables "));
        list.add(new MainModel(R.drawable.kesar ,   "Kesar Milk" , "30" , "Kesar milk is whole milk insured with the goodness of saffron."));
        list.add(new MainModel(R.drawable.chai ,   "Tea" , "10" , "A delicious, warming Ginger Tea made with fresh ginger roots, tea leaves and milk."));


        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}