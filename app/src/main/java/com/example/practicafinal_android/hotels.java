package com.example.practicafinal_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class hotels extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String titulo = "Hotels";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setTitle(titulo);
        setContentView(R.layout.activity_hotels);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_hotels, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int select, long id) {
        if (select == 0) {
            FragmentManager fm = getSupportFragmentManager();
            hoteles3stars fragment1 = new hoteles3stars();
            fm.beginTransaction().replace(R.id.contenidorFragment, fragment1).commit();
        }
        else if (select == 1) {
            FragmentManager fm = getSupportFragmentManager();
            Hotels4stars fragment2 = new Hotels4stars();
            fm.beginTransaction().replace(R.id.contenidorFragment, fragment2).commit();
        }
        else if (select == 2) {
            FragmentManager fm = getSupportFragmentManager();
            hotels5stars fragment3 = new hotels5stars();
            fm.beginTransaction().replace(R.id.contenidorFragment, fragment3).commit();
        }
    }
    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences Preferences = PreferenceManager.getDefaultSharedPreferences(this);
        if(Preferences.contains("colorBackground"))
        {
            String colorBackground = Preferences.getString("colorBackground","");
            getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor(colorBackground)));
        }
    }

}