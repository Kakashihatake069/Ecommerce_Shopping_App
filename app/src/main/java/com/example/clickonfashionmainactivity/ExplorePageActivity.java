package com.example.clickonfashionmainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ExplorePageActivity extends AppCompatActivity {

    ImageButton imgbhome2,imgbcategories2,imgbexplore2,imgbprofile2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_page);

        imgbhome2=findViewById(R.id.imgbhome2);
        imgbcategories2=findViewById(R.id.imgbcategories2);
        imgbexplore2=findViewById(R.id.imgbexplore2);
        imgbprofile2=findViewById(R.id.imgbprofile2);

        imgbcategories2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ExplorePageActivity.this,CategoriesPageActivity.class);
                startActivity(i);
            }
        });
        imgbhome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent o = new Intent(ExplorePageActivity.this,MainActivity.class);
                startActivity(o);
            }
        });
        imgbprofile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(ExplorePageActivity.this,ProfilePageActivity.class);
                startActivity(p);
            }
        });
    }
}