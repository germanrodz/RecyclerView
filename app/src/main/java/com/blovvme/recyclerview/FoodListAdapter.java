package com.blovvme.recyclerview;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Blovvme on 8/10/17.
 */

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.ViewHolder> {


    private static final String TAG = "FoodListAdapter";
    List<Food> foodList = new ArrayList<>();

    public FoodListAdapter(List<Food> foodList) {
        this.foodList = foodList;

    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvDishName;
        TextView tvCalories;
        TextView tvPrice;
        TextView tvRating;

       public ViewHolder(View itemView) {
            super(itemView);
           Log.d(TAG, "onBindViewHolder: ");
           tvDishName = (TextView) itemView.findViewById(R.id.tvDishName);
           tvCalories = (TextView) itemView.findViewById(R.id.tvFoodCalories);
           tvPrice =(TextView) itemView.findViewById(R.id.tvFoodPrice);
           tvRating = (TextView)itemView.findViewById(R.id.tvFoodRating);


//           itemView.setOnClickListener(new View.OnClickListener() {
//               @Override
//               public void onClick(View v) {
//                   Intent intent = new Intent(v.getContext(),SecondActivity.class);
//                   intent.putExtra("flag1",tvDishName.getText().toString());
//                   intent.putExtra("flag2",tvCalories.getText().toString());
//                   intent.putExtra("flag3",tvPrice.getText().toString());
//                   intent.putExtra("flag4",tvRating.getText().toString());
//                   startActivity(intent);
//
//               }
//           });
        }
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder" );
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.foodlist_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Food food = foodList.get(position);
        holder.tvDishName.setText(food.getDishName());
        holder.tvCalories.setText(String.valueOf(food.getCalories()));
        holder.tvPrice.setText(String .valueOf(food.getPrice()));
        holder.tvRating.setText(String.valueOf(food.getPrice()));
    }



    @Override
    public int getItemCount() {
        return foodList.size();
    }


}////
