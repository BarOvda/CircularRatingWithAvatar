package com.example.circularratingwithavatar;

import android.os.Bundle;

import com.example.circularratingwithavatarlibrary.ProgressTextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ProgressTextView progressImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        this.progressImageView=findViewById(R.id.layout);


    }


}