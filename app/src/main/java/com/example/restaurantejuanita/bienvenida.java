package com.example.restaurantejuanita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class bienvenida extends AppCompatActivity {
public static final long SPLASH_SCREEN_DELAY=2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        TimerTask time=new TimerTask() {
            @Override
            public void run() {
                Intent in= new Intent().setClass(bienvenida.this,bienvenida2.class);
                startActivity(in);
                finish();
            }
        };

        Timer timer=new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);
    }
}