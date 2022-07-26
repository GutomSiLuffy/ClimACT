package com.karen.application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ShareActionProvider;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class homepage extends AppCompatActivity {

    TextView name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        name=findViewById(R.id.textView2);

       // Intent i=getIntent();
      //  nametext= i.getStringExtra("Fname");
       // name.setText(nametext);

        SharedPreferences sharedPreferences=getSharedPreferences("mykey",MODE_PRIVATE);
        String value =sharedPreferences.getString("Full", "");
        name.setText(value);

    }

}