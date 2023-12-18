package com.example.diplom_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Shemy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shemy);
    }
    public void openCvet(View view){
        Intent intent2 = new Intent(this, Cvet.class);
        startActivity(intent2);
    }
    public void openGenZV(View view){
        Intent intent2 = new Intent(this, GenZV.class);
        startActivity(intent2);
    }
    public void openSvet(View view){
        Intent intent2 = new Intent(this, MorgSvet.class);
        startActivity(intent2);
    }
}