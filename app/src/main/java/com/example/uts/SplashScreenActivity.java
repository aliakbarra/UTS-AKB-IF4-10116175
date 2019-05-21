package com.example.uts;

/*
Minggu,19 Mei 2019   10116175 aliakbar IF-4
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.uts.View.Activity_Intro;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Intent intent = new Intent(getApplicationContext(),
                Activity_Intro.class);
        startActivity(intent);
        finish();
    }
}
