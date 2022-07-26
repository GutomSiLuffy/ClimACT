package com.karen.application;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;


public class HomeFragment extends Fragment {

TextView regions,celcius;
String regText, Item;
Spinner spin;
ImageView img,img2;

SharedPreferences sharedPreferences;
SharedPreferences editor;


   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                        Bundle savedInstanceState) {


        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_home, container, false);

    img=view.findViewById(R.id.imageView4);
    img2=view.findViewById(R.id.imageView7);
    celcius=view.findViewById(R.id.textView12);
    spin=view.findViewById(R.id.spinner);



    img.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =new Intent(getActivity(),homepage.class);
            startActivity(intent);
        }
    });

    img2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =new Intent(getActivity(), event.class);
            startActivity(intent);
        }
    });






        return view;

        //  }


    }}
