package com.pete.restaurant;

import java.util.List;

@Dao
public interface RestaurantDao {
    @Insert(onConflict = OnConfictStrategy.IGNORE)
    void insert(Restaurant restaurant);

    @Query("DELETE FROM restaurant")
    void deleteAll();

    @Query("SELECT * FROM restaurant")
    LiveData<List<Restaurant>> getAllRestaurants();
}
