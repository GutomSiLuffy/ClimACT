package com.karen.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import java.util.Timer;
import java.util.TimerTask;

public class introduction extends AppCompatActivity {
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        timer= new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent in =new Intent(getApplication(),MainActivity.class);
                startActivity(in);
                finish();
                ;
            }
        },3000);

    }
}