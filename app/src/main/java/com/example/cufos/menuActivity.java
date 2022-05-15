package com.example.cufos;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.cufos.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class menuActivity extends AppCompatActivity {

    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.choo , "Chocolate " , "50" , "Blended with cocoa powder along with milk"));
        list.add(new MainModel(R.drawable.b , "Butter Scotch" , "50" , "Butter scotch Cone "));
        list.add(new MainModel(R.drawable.frr1, "Frozen Desert " , "90" , "Ice cream is a type of sweetened frozen dessert that is usually flavoured, contains ice and is eaten in the frozen state."));
        list.add(new MainModel(R.drawable.saa ,   "Sacch Mucch Aam" , "60" , "A fresh Mango Flavoured Icecream"));
        list.add(new MainModel(R.drawable.bl ,   "Black Current " , "100" , "fresh black grapes pulp and whipped cream"));
        list.add(new MainModel(R.drawable.cake , "cake" , "200" , "This kitkat cake is based on chocolate truffle which is made with a moist chocolate cake recipe, chocolate truffle filling & chocolate frosting"));
        list.add(new MainModel(R.drawable.pastry ,     "Pastry" ,  "30" , "Black Forest pastry with strawberry toupiung"));
        list.add(new MainModel(R.drawable.pizzapic , "pizza" , "300" , "Prepared using hand made pizza dough, sauce, corn with cheese dressing and mozzarella cheese."));
        list.add(new MainModel(R.drawable.noodle ,   "noodle" , "100" , "Yummy noodles tossed with flavourful paneer cubes"));
        list.add(new MainModel(R.drawable.momo ,     "momos" ,  "60" , "Vegetable pan fried momo served along with our in house manchurian sauce"));
        list.add(new MainModel(R.drawable.sandwitch , "sandwich" , "60" , "Loaded extra cheese, vegitable(onion+capsicum+tamto),paneer, cream, olive.etc,"));
        list.add(new MainModel(R.drawable.springroll , "Spring roll" , "40" , "Extra crispy and spicy, paneer spring roll served with special sil batta red chutney (redchili momo flavour) + dessert free."));
        list.add(new MainModel(R.drawable.vegbullet , "Veg Bullet" , "50" , "Crispy veg bullet with red chutney "));
        list.add(new MainModel(R.drawable.chole , "Chole Bhature" , "40" , "2 Paneer Kulche+2 Paneer Bhatoora+2 Aloo Kulcha+1 Full Rice+1 Coke 750Ml+2 Chhole Bhatoora"));
        list.add(new MainModel(R.drawable.pasta, "Pasta" , "100" , "A delicious pasta covered in a fiery red sauce, topped with cheese slice."));
        list.add(new MainModel(R.drawable.straberry, "strawberry Shake" , "60" , "fresh Strawberry shake "));


        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}