package com.example.diplom_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chteny extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chteny);
    }
    public void openNagr(View view){
        Intent intent2 = new Intent(this, Nagr.class);
        startActivity(intent2);
    }
    public void openObozn(View view){
        Intent intent2 = new Intent(this, Obozn.class);
        startActivity(intent2);
    }
    public void openPon(View view){
        Intent intent2 = new Intent(this, Pon.class);
        startActivity(intent2);
    }
}