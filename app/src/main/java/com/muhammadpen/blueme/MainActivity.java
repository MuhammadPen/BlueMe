package com.muhammadpen.blueme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {


    //Initializing the views
    EditText searchEditText = null;
    ImageButton searchButton = null;
    ImageView vid1Thumbnail = null;
    ImageView vid2Thumbnail = null;
    ImageView vid3Thumbnail = null;
    ScrollView scrollView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //Defining the views
        searchEditText = findViewById(R.id.searchEditText);
        searchButton = findViewById(R.id.searchButton);
        scrollView = findViewById(R.id.scrollView);
        vid1Thumbnail = findViewById(R.id.vid1Thumbnail);
        vid2Thumbnail = findViewById(R.id.vid2Thumbnail);
        vid3Thumbnail = findViewById(R.id.vid3Thumbnail);

        Picasso.with(this).load("https://img.youtube.com/vi/QxIR8x2CefM/0.jpg").into(vid1Thumbnail);

    }

}