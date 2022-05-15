package com.example.cufos;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.cufos.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class CornerActivity extends AppCompatActivity {

    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.c1 ,   "Veg Thali" , "50" , "Dal + Choice of 3 roti/2 paratha + Kachumber salad"));
        list.add(new MainModel(R.drawable.c2 ,   "Spcl. Veg Thali" , "100" , "Each thali containing : 3 pc butter tawa roti + Dry veg + Paneer masala + Dal Tadka + Jeera rice + Gulab Jamun + Lacha onions + papad + pickle"));
        list.add(new MainModel(R.drawable.c3 ,   "chinease Thali" , "100" , "Manchurian + Noodles + rice + 3 roti"));
        list.add(new MainModel(R.drawable.c4 ,   "rajma Rice" , "60" , "Summer special Rajma Rice"));
        list.add(new MainModel(R.drawable.c5 ,   " Kadhi Rice" , "60" , "Kadhi pakoda Rice "));
        list.add(new MainModel(R.drawable.c6 ,   "Manchurian Rice" , "60" , "Chinease sepcial full loaded with veggie + Rice")) ;
        list.add(new MainModel(R.drawable.c7 ,   "Non Veg Thali" , "150" , "Chef's special Chicken tikka masala + Flavorful dal tadka + 3 pc roti + Jeera rice + salad + papad + Pickle"));
        list.add(new MainModel(R.drawable.c8 ,   "Paneer Rice" , "60" , "Paneer butter masala with Rice Combo"));


        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}