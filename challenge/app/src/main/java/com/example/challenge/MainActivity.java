package com.example.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ALC 4.0 phase 1");
    }

    // launch About ALC
    public void viewAboutALC(View view){
        Intent intent = new Intent(this, AboutALC.class);
        startActivity(intent);
    }

    // launch profile
    public void viewProfile(View view){
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }
}
