package com.karen.application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class BottomN extends AppCompatActivity {

    BottomNavigationView navigationView;

    Spinner spinner;
    TextView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottombar);

        view=findViewById(R.id.textView12);
        spinner=findViewById(R.id.spinner);

        String[] region ={"Select","Batac City","Laoag City","Candon City","Vigan City","San Fernando","Alaminos City","Dagupan City","San Carlos City","Urdaneta City"};
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,region);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int  position, long id) {
String a,b;

       a=spinner.getSelectedItem().toString().trim();





                    //   image.setImageResource(R.drawable.future);break;
                }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });







        navigationView=findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.body,new HomeFragment()).commit();
        navigationView.setSelectedItemId(R.id.nav_menu);

        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return true;
            }
        });

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.nav_menu:
                        fragment= new HomeFragment();break;
                    case R.id.nav_current:
                        fragment= new CurrentFragment();break;
                    case R.id.nav_future:
                        fragment= new FutureFragment();break;
                    case R.id.nav_statistic:
                        fragment= new StatisticFragment();break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.body,fragment).commit();
                return true;
            }
        });{


        }
    }
}