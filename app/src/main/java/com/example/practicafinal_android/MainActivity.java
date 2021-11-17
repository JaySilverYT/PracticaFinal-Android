package com.example.practicafinal_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView logoHotel, logoRestaurant, logoParking, logoPelis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logoHotel = findViewById(R.id.logoHotel);
        logoHotel.setOnClickListener(this);

        logoRestaurant = findViewById(R.id.logoRestaurant);
        logoRestaurant.setOnClickListener(this);

        logoParking = findViewById(R.id.logoParking);
        logoParking.setOnClickListener(this);

        logoPelis = findViewById(R.id.logoPelis);
        logoPelis.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == logoHotel.getId())
        {
            startActivity(new Intent(this, hotels.class));
        }
        else if (v.getId() == logoRestaurant.getId())
        {
            startActivity(new Intent(this, Restaurants.class));
        }
        else if (v.getId() == logoParking.getId())
        {
            startActivity(new Intent(this, parking.class));
        }
        else if (v.getId() == logoPelis.getId())
        {
            startActivity(new Intent(this, movies.class));
        }
    }
}