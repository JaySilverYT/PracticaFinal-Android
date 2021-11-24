package com.example.practicafinal_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Restaurants extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

    Spinner spinner = (Spinner) findViewById(R.id.spinner);
    spinner.setOnItemSelectedListener(this);

    // Create an ArrayAdapter using the string array and a default spinner layout
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.spinner_array, android.R.layout.simple_spinner_item);


    // Specify the layout to use when the list of choices appears
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        if (position == 0) //Restaurants Italians
        {
            //TODO: Inflar fragments dels italians
            FragmentManager fm = getSupportFragmentManager();
            R_Italians fragment1 = new R_Italians();
            fm.beginTransaction().replace(R.id.contenidorFragment, fragment1).commit();// o .replace si vol substituir o afegir
        }
        else if (position == 1) //Restaurants Chinos
        {
            //TODO: Inflar fragments dels chinos
        }
        else if (position == 2) //Restaurantes Japoneses
        {
            //TODO: Inflar fragments dels japoneses
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }


}