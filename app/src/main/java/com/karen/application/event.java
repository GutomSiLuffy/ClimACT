package com.karen.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class event extends AppCompatActivity {
ImageView menu, prof;
TextView name, see;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events);

        menu=findViewById(R.id.imageView5);
        prof=findViewById(R.id.imageView6);
        name=findViewById(R.id.textView13);
        see=findViewById(R.id.textView15);

        SharedPreferences sharedPreferences=getSharedPreferences("mykey",MODE_PRIVATE);
        String value =sharedPreferences.getString("Full", "");
        name.setText(value);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),BottomN.class);
                startActivity(i);
            }
        });

        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),homepage.class);
                startActivity(i);
            }
        });

        see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Done.class);
                startActivity(i);
            }
        });
    }
}