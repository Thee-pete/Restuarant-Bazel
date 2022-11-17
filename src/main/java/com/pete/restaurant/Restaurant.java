package com.pete.restaurant;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName= "restaurant")
public class Restaurant {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name="restaurant")
    private String restaurant_name;
    private String location;
    private String rating;

    public Restaurant(@NonNull String restaurant_name, String location, String rating){
        this.restaurant_name =restaurant_name;
        this.location = location;
        this.rating =rating;

    }
    public String getRestaurant_name(){
        return this.restaurant_name;
    }
    public String getLocation(){
        return  this.location
    }
    public String getRating(){
        return  this.rating;
    }
}