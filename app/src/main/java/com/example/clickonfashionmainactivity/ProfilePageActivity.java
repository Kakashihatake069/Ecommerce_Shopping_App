package com.example.clickonfashionmainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProfilePageActivity extends AppCompatActivity {

    ImageButton imgbback;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        imgbback = findViewById(R.id.imgbback);

        imgbback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(ProfilePageActivity.this,MainActivity.class);
                startActivity(b);
            }
        });
    }
}