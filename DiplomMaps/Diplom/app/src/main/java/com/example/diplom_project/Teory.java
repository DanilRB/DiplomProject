package com.example.diplom_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Teory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teory);
    }
    public void openSilaToka(View view){
        Intent intent2 = new Intent(this, SilaToka.class);
        startActivity(intent2);
    }
    public void openNapr(View view){
        Intent intent2 = new Intent(this, napr.class);
        startActivity(intent2);
    }
    public void openSopr(View view){
        Intent intent2 = new Intent(this, Sopr.class);
        startActivity(intent2);
    }
    public void openVAX(View view){
        Intent intent2 = new Intent(this, VAX.class);
        startActivity(intent2);
    }
    public void openAPS(View view){
        Intent intent2 = new Intent(this, APS.class);
        startActivity(intent2);
    }
    public void openRabotaToka(View view){
        Intent intent2 = new Intent(this, RabotaToka.class);
        startActivity(intent2);
    }
    public void openKorotok(View view){
        Intent intent2 = new Intent(this, Korotok.class);
        startActivity(intent2);
    }
    public void openADS(View view){
        Intent intent2 = new Intent(this, ADS.class);
        startActivity(intent2);
    }
    public void openPeremPost(View view){
        Intent intent2 = new Intent(this, PeremPost.class);
        startActivity(intent2);
    }
    public void openZakonOma(View view){
        Intent intent2 = new Intent(this, ZakonOma.class);
        startActivity(intent2);
    }
    public void openPN(View view){
        Intent intent2 = new Intent(this, PN.class);
        startActivity(intent2);
    }
    public void openKvarc(View view){
        Intent intent2 = new Intent(this, Kvarc.class);
        startActivity(intent2);
    }
    public void openDiod(View view){
        Intent intent2 = new Intent(this, Diod.class);
        startActivity(intent2);
    }
    public void openRele(View view){
        Intent intent2 = new Intent(this, Rele.class);
        startActivity(intent2);
    }
    public void openKonder(View view){
        Intent intent2 = new Intent(this, Konder.class);
        startActivity(intent2);
    }
    public void openResistor(View view){
        Intent intent2 = new Intent(this, Resistor.class);
        startActivity(intent2);
    }
    public void openTransf(View view){
        Intent intent2 = new Intent(this, Trans.class);
        startActivity(intent2);
    }
}