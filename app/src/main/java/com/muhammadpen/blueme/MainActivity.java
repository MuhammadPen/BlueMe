//TO DO :
//Make video view invisible after playing
//Insert padding between video views
//Add media controllers
//Add full screen video players
//Convert these into a list for addition of more video views and enable verticle scrolling
//Use android icons and add a play-icon on every thumb nail
//(Late development) Make it so that a user can use a media controller to enter full screen
//Figure out smoother transition between the splash screen and the content
//Manage this properly on Git hub.

package com.muhammadpen.blueme;

import android.media.Image;
import android.net.Uri;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView splashScreen = null;
    CountDownTimer splashScreenTimer;
    VideoView card1VideoView = null;
    VideoView card2VideoView = null;
    VideoView card3VideoView = null;
    CardView card1 = null;
    CardView card2 = null;
    CardView card3 = null;

    public void card1Pressed(View view){


        boolean playback = false;
        card1VideoView = findViewById(R.id.card1VideoView);
        card1 = findViewById(R.id.card1);
        String uriPath = "android.resource://com.muhammadpen.blueme/" + R.raw.leaves;
        Uri uri = Uri.parse(uriPath);
        card1VideoView.setVideoURI(uri);
        if (playback == false) {
            card1.animate().alpha(0);
            card1VideoView.start();

            playback = true;
        }else{
            card1.animate().alpha(1);
        }

    }

    public void card2Pressed(View view){


        boolean playback = false;
        card2VideoView = findViewById(R.id.card2VideoView);
        card2 = findViewById(R.id.card2);
        String uriPath = "android.resource://com.muhammadpen.blueme/" + R.raw.bird;
        Uri uri = Uri.parse(uriPath);
        card2VideoView.setVideoURI(uri);
        if (playback == false) {
            card2.animate().alpha(0);
            card2VideoView.start();

            playback = true;
        }else{
            card2.animate().alpha(1);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initially setting everything to be invisible
        final RelativeLayout relativeLayout = findViewById(R.id.relativeLayout);
        relativeLayout.setAlpha(0);

        //Splash screen with fade animation
        splashScreen = findViewById(R.id.splashScreenImageView);
        splashScreenTimer = new CountDownTimer(1000, 10) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {

                splashScreen.animate().alpha((float) 0.00);
                //Everything becomes visible in a fade-in manner
                relativeLayout.animate().alpha(1);
            }
        }.start();


    }




}
