package com.example.circularratingwithavatar;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.example.circularratingwithavatarlibrary.ProgressTextView;

public class MainActivity extends AppCompatActivity {
    private ProgressTextView progressImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        this.progressImageView=findViewById(R.id.layout);


    }


}