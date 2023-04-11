package com.example.clickonfashionmainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

   ImageButton imgbhome,imgbcategories,imgbexplore,imgbprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgbhome=findViewById(R.id.imgbhome);
        imgbcategories=findViewById(R.id.imgbcategories);
        imgbexplore=findViewById(R.id.imgbexplore);
        imgbprofile=findViewById(R.id.imgbprofile);




        imgbcategories.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,CategoriesPageActivity.class);
                startActivity(i);
            }
        });

        imgbexplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(MainActivity.this,ExplorePageActivity.class);
                startActivity(o);
            }
        });

        imgbprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(MainActivity.this,ProfilePageActivity.class);
                startActivity(p);
            }
        });
    }







}