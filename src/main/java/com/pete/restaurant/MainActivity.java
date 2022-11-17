package com.pete.restaurant;


import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

   /* private MainActivityViewModel mainActivityViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        final RestaurantsAdapter adapter = new RestaurantsAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        mainActivityViewModel.getMyRestaurants().observe(this, restaurants->{
            adapter.submitList(restaurants);
        });



    }*/
}