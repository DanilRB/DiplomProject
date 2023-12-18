package com.example.diplom_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Remont extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remont);
    }
    public void openFlash(View view){
        Intent intent2 = new Intent(this, Flash.class);
        startActivity(intent2);
    }
    public void openMonik(View view){
        Intent intent2 = new Intent(this, Monik.class);
        startActivity(intent2);
    }
    public void openMysh(View view){
        Intent intent2 = new Intent(this, Mysh.class);
        startActivity(intent2);
    }
}