package com.example.diplom_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Practica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica);
    }
    public void openMult(View view){
        Intent intent2 = new Intent(this, OpenMult.class);
        startActivity(intent2);
    }
    public void openOsc(View view){
        Intent intent2 = new Intent(this, OpenOsc.class);
        startActivity(intent2);
    }
    public void openPay(View view){
        Intent intent2 = new Intent(this, OpenPay.class);
        startActivity(intent2);
    }
}