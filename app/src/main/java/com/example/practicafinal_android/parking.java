package com.example.practicafinal_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class parking extends AppCompatActivity {
    String titulo = "Parkings";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(titulo);
        setContentView(R.layout.activity_parking);
    }
}