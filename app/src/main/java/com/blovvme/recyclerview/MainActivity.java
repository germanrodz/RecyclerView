package com.blovvme.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Food> foodlist;
    RecyclerView tvFoodList;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.ItemAnimator itemAnimator;

    FoodListAdapter foodListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFoodList = (RecyclerView) findViewById(R.id.tvFoodList);
        layoutManager = new LinearLayoutManager(this);
        itemAnimator = new DefaultItemAnimator();
        tvFoodList.setLayoutManager(layoutManager);
        tvFoodList.setItemAnimator(itemAnimator);
        //initialize adapter
        initFoodList();
        foodListAdapter = new FoodListAdapter(foodlist);
        //command option m
        //short cut to make a method
        tvFoodList.setAdapter(foodListAdapter);

        foodListAdapter.notifyDataSetChanged();


    }
    //food list name
    private void initFoodList() {
        foodlist= new ArrayList<>();
        foodlist.add(new Food("Burger",12,300,4.5));
        foodlist.add(new Food("Pizza",34,340,4.9));
        foodlist.add(new Food("Soup",14,500,4.1));
        foodlist.add(new Food("Fried Rice",15,600,2.5));
    }



}////
