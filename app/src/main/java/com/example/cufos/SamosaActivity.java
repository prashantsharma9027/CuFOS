package com.example.cufos;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.cufos.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class SamosaActivity extends AppCompatActivity {

    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.s1, " mango Shake", "50", "Sugar ripe mango with Ice"));
        list.add(new MainModel(R.drawable.s2, "Banana Shake", "40", "Blended ripe banana's with ice and milk"));
        list.add(new MainModel(R.drawable.s3, "Oreo Shake", "50", "A much loved stuffed Indian flatbread, Gobi (Cauliflower) paratha is a staple dish in most North india"));
        list.add(new MainModel(R.drawable.s4, " Butter Skotch", "50", "vanilla extract and vanilla ice cream to a blender and blend to make a smooth shake."));
        list.add(new MainModel(R.drawable.s5, "Mango lassi", "40", "Lassi is a blend of yogurt, water, spices and sometimes fruit."));
        list.add(new MainModel(R.drawable.s7, "vanilla Shake", "50", "blending milk, vanilla ice cream and vanilla extract."));
        list.add(new MainModel(R.drawable.s8, "Strawberry Shake", "60", "Strawberry milkshake is a delicious drink made with strawberries"));
        list.add(new MainModel(R.drawable.s9, "Green Apple Mojito", "40", "Green Apple Mojito with white rum, green apple syrup, lemon juice, soda and mint leave"));
        list.add(new MainModel(R.drawable.s10, " Virgin Mojito", "40", "it is in turns sweet, acidic, minty, and sparklin"));
        list.add(new MainModel(R.drawable.s11, "Cold Coffee", "40", "Made with coffee, sugar and milk/water"));
        list.add(new MainModel(R.drawable.s12, "Hot Coffee", "25", "powdered coffee beans."));
        list.add(new MainModel(R.drawable.s6, "Chocolate Lassi", "30", "Chocolate lassi is a sweetened, chilled beverage made with thick curd or youghurt, cocoa powder and sugar. "));


        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}