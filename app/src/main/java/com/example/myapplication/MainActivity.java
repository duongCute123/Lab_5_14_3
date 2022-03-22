package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView btn_list;
    ArrayList<Item_entity> item_views;
    Item_util item_view_util;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_list=findViewById(R.id.btn_list);
        item_views=new ArrayList<>();
        item_views.add(new Item_entity("Tasty donut","Spicy tasty donut family",
                10.000,R.drawable.donut_yellow_1));
        item_views.add(new Item_entity("Tasty donut","Spicy tasty donut family",
                20.000,R.drawable.green_donut_1));
        item_views.add(new Item_entity("Tasty donut","Spicy tasty donut family",
                30.000,R.drawable.donut_red_1));
        item_views.add(new Item_entity("Tasty donut","Spicy tasty donut family",
                40.000,R.drawable.tasty_donut_1));
         item_view_util=new Item_util(this,item_views,R.layout.customer_list_view);
        btn_list.setAdapter(item_view_util);



    }
}