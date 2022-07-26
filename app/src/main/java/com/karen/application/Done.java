package com.karen.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Done extends AppCompatActivity {

    TextView greats;
    Button dones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.done);

        greats=findViewById(R.id.display);
        dones=findViewById(R.id.button2);
        SharedPreferences sharedPreferences=getSharedPreferences("mykey",MODE_PRIVATE);
        String value =sharedPreferences.getString("Full", "");
        String show= "Great Job " +value +"!";
       greats.setText(show);

        dones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),event.class);
                startActivity(i);
            }
        });
    }
}