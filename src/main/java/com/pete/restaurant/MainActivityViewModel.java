package com.pete.restaurant;


import android.app.Application;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private RestaurantRepository restaurantRepository;
    private final LiveData<List<Restaurant>> restaurants;

    public MainActivityViewModel(Application application){
        super(application);
        restaurantRepository = new RestaurantRepository(application);
        restaurants = restaurantRepository.getRestaurants();
    }
    LiveData<List<Restaurant>> getMyRestaurants(){
        return restaurants;
    }
    public void insert(Restaurant restaurant){
        restaurantRepository.insert(restaurant);
    }

}
