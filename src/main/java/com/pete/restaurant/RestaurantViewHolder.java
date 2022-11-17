package com.pete.restaurant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class RestaurantViewHolder extends  RecylerView.ViewHolder{

    private final TextView restaurantName;
    private final TextView location;
    private final TextView rating;
    private  RestaurantViewHolder(View itemView){
        super(itemView);
        restaurantName = itemView.findViewById(R.id.restaurantName);
        location = itemView.findViewById(R.id.location);
        rating =itemView.findViewById(R.id.rating);
    }
    public void bind(String restaurant_name, String locationStr, String ratingStr){
        restaurantName.setText(restaurant_name);
        location.setText(locationStr);
        rating.setText(ratingStr);
    }
    static  RestaurantViewHolder create (ViewGroup parent){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurant_item, parent, false);
        return new RestaurantViewHolder(view);
    }
}
