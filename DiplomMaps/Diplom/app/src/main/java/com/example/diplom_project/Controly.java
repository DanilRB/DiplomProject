package com.example.diplom_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Controly extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controly);
    }
    public void openGrom(View view){
        Intent intent2 = new Intent(this, Grom.class);
        startActivity(intent2);
    }
    public void openMK(View view){
        Intent intent2 = new Intent(this, MK.class);
        startActivity(intent2);
    }
    public void openUniprof(View view){
        Intent intent2 = new Intent(this, Uniprof.class);
        startActivity(intent2);
    }
}