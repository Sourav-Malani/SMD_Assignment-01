package com.souravmalani.i190434;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
    }
    public void onSignUpClicked(View view) {
        Intent intent = new Intent(this, registration.class);
        startActivity(intent);
    }
    public void onLogin_mainClicked(View view) {
        Intent intent = new Intent(this, homepage.class);
        startActivity(intent);
    }

//    public void onSigninClicked(View view) {
//        Intent intent = new Intent(this, activity_main.class);
//        startActivity(intent);
//    }
}