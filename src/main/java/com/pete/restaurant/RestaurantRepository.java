package com.pete.restaurant;

import android.app.Application;

import java.util.List;

class RestaurantRepository {
   /* private RestaurantDao restaurantDao;
    private LiveData<List<Restaurant>> restaurants;

    RestaurantRepository(Application application){
        RestaurantDatabase restaurantDatabase = RestaurantDatabase.getInstance(application);
        restaurantDao = restaurantDatabase.restaurantDao();
        restaurants = restaurantDao.getAllRestaurants();
    }

    LiveData<List<Restaurant>> getRestaurants(){
        return restaurants;
    }

    void insert(Restaurant restaurant){
        RestaurantDatabase.databaseWriteExecutor.execute(()->{
            restaurantDao.insert(restaurant);
        });
    }*/
}
