package com.example.practicafinal_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class movies extends AppCompatActivity {
    String titulo = "Movies";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(titulo);
        setContentView(R.layout.activity_movies);
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