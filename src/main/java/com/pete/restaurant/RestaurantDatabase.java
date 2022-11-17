package com.pete.restaurant;

import android.content.Context;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Restaurant.class}, version = 1, exportSchema = false)
public class RestaurantDatabase extends RoomDatabase{
    public abstract RestaurantDao restaurantDao();

    public static volatile RestaurantDatabase INSTANCE;
    private static final int THREADS_NO =4;
    static  final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(THREADS_NO);
    static RestaurantDatabase getInstance(final Context context){
        if (INSTANCE == null){
            synchronized (RestaurantDatabase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext()),
                    RestaurantDatabase.class, "restaurant_db")
                    .build();
                }
            }
        }
        return INSTANCE;
    }
}
