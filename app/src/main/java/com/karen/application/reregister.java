package com.karen.application;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class reregister extends AppCompatActivity {

    EditText  etFname,  etemail, etpassword, etpass2;
    Button btnregister;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


        etFname=findViewById(R.id.editTextTextPersonName2);
        etemail=findViewById(R.id.editTextTextEmailAddress2);
        etpassword=findViewById(R.id.editTextTextPassword2);
        etpass2=findViewById(R.id.editTextTextPassword3);



        btnregister=findViewById(R.id.button);


        //by cliccking this use on click listener
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  strFname, strEmail, strPassword, strPass2;//container


                strFname=etFname.getText().toString().trim();
                strEmail=etemail.getText().toString().trim();
                strPassword=etpassword.getText().toString().trim();
                strPass2=etpass2.getText().toString().trim();


if(Objects.equals(strFname, "")){
Toast.makeText(getApplicationContext(),"Please enter Your name",Toast.LENGTH_LONG).show();
}
 else if (Objects.equals(strEmail, "")){
    Toast.makeText(getApplicationContext(),"Please enter Your email",Toast.LENGTH_LONG).show();
} else if(!strPassword.equals(strPass2)){
                    Toast.makeText(getApplicationContext(),"Password do not match",Toast.LENGTH_LONG).show();
                }else{
                     Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    SharedPreferences sharedPreferences= getSharedPreferences("mykey",MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("Full",strFname);
                    editor.putString("email",strEmail);
                    editor.putString("password",strPassword);
                     editor.apply();
                    i.putExtra("Fname", strFname);
                    i.putExtra("Email", strEmail);
                    i.putExtra("Password", strPassword);
                     i.putExtra("Confirm",strPass2);
                     startActivity(i);

                }





            }
        });

    }
    public void signn (View view){


        Intent intent =new Intent(getApplication(),MainActivity.class);
        startActivity(intent);

    }
}
