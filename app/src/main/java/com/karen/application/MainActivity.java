package com.karen.application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    EditText etEmail, etPassword;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        etEmail=findViewById(R.id.editTextTextEmailAddress);
        etPassword=findViewById(R.id.editTextTextPassword);
        login=findViewById(R.id.button);




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // add function after clicking the buttton here

                String email, password,logEmail,logPassword,name;
                email=getIntent().getStringExtra("Email");
                password=getIntent().getStringExtra("Password");

                logEmail= etEmail.getText().toString().trim();
                logPassword=etPassword.getText().toString().trim();
                name=getIntent().getStringExtra("Fname");



                if (logEmail.equals(email) && logPassword.equals(password))
                {

                    Intent i = new Intent(getApplicationContext(), BottomN.class);
                    i.putExtra("Fname" , name);
                    i.putExtra("Email",email);
                    startActivity(i);
              } else {
                Toast.makeText(getApplicationContext(), "ACCOUNT DOES NOT EXIST!!", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
    public void sign (View view){
        Intent intent= new Intent(getApplication(),reregister.class);
        startActivity(intent);
    }
}
