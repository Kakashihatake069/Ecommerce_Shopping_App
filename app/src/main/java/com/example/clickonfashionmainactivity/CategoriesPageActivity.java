package com.example.clickonfashionmainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CategoriesPageActivity extends AppCompatActivity {

    ImageButton imgbhome1,imgbcategories1,imgbexplore1,imgbprofile1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_page);

        imgbhome1=findViewById(R.id.imgbhome1);
        imgbcategories1=findViewById(R.id.imgbcategories1);
        imgbexplore1=findViewById(R.id.imgbexplore1);
        imgbprofile1=findViewById(R.id.imgbprofile1);

        imgbhome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoriesPageActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        imgbexplore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesPageActivity.this,ExplorePageActivity.class);
                startActivity(i);
            }
        });
        imgbprofile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(CategoriesPageActivity.this,ProfilePageActivity.class);
                startActivity(p);
            }
        });
    }
}