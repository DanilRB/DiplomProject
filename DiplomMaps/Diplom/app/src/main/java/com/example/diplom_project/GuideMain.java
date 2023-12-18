package com.example.diplom_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GuideMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_main);
    }
    public void clickTeory(View view){
        Intent intent = new Intent(this, Teory.class);
        startActivity(intent);
    }
    public void clickPractica(View view){
        Intent intent = new Intent(this, Practica.class);
        startActivity(intent);
    }
    public void clickShemy(View view){
        Intent intent = new Intent(this, Shemy.class);
        startActivity(intent);
    }
    public void clickRemont(View view){
        Intent intent = new Intent(this, Remont.class);
        startActivity(intent);
    }
    public void clickControly(View view){
        Intent intent = new Intent(this, Controly.class);
        startActivity(intent);
    }
    public void clickChteny(View view){
        Intent intent = new Intent(this, Chteny.class);
        startActivity(intent);
    }

}