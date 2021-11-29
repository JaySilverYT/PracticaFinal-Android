package com.example.practicafinal_android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView logoHotel, logoRestaurant, logoParking, logoPelis;
    String titulo = "APP Practica Android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setTitle(titulo);
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
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.menuFondo:
                /* El menu About executa una nova activitat definida a About.java*/
                //startActivity(new Intent(this, About.class));
            case R.id.menuFuente:
                /*
                De moment no fa res
                */
        }
        return true;
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