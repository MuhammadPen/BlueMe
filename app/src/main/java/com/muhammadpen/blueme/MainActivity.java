//TO DO :
//Make video view invisible after playing -done
//Add padding between video views -done
//Fix the splash screen -done
//Add full screen video players with media controllers
//Convert these into a list for addition of more video views and enable verticle scrolling
//Use android icons and add a play-icon on every thumb nail
//(Late development) Make it so that a user can use a media controller to enter full screen
//Figure out smoother transition between the splash screen and the content
//Manage this properly on Git hub.

package com.muhammadpen.blueme;

import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Initializing views and variables etc
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

        //Setting up views
        card1VideoView = findViewById(R.id.card1VideoView);
        card1 = findViewById(R.id.card1);

        //Setting up video link
        String uriPath = "android.resource://com.muhammadpen.blueme/" + R.raw.leaves;
        Uri uri = Uri.parse(uriPath);
        card1VideoView.setVideoURI(uri);

        if (playback == false) {

            //Playing the video
            card1.animate().alpha(0);
            card1VideoView.animate().alpha(1);
            card1VideoView.start();


            card1VideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp1)
                {
                    // Video Playing is completed
                    card1.animate().alpha(1);
                    card1VideoView.animate().alpha(0);

                }
            });
        }

    }

    public void card2Pressed(View view){

        boolean playback = false;

        //Setting up views
        card2VideoView = findViewById(R.id.card2VideoView);
        card2 = findViewById(R.id.card2);

        //Setting up video link
        String uriPath = "android.resource://com.muhammadpen.blueme/" + R.raw.bird;
        Uri uri = Uri.parse(uriPath);
        card2VideoView.setVideoURI(uri);

        if (playback == false) {

            //Playing the video
            card2.animate().alpha(0);
            card2VideoView.animate().alpha(1);
            card2VideoView.start();

            card2VideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp2)
                {
                    // Video Playing is completed
                    card2.animate().alpha(1);
                    card2VideoView.animate().alpha(0);
                }
            });
        }

    }

    public void card3Pressed(View view){


        boolean playback = false;

        //Setting up views
        card3VideoView = findViewById(R.id.card3VideoView);
        card3 = findViewById(R.id.card3);

        //Setting up video link
        String uriPath = "android.resource://com.muhammadpen.blueme/" + R.raw.bunny;
        Uri uri = Uri.parse(uriPath);
        card3VideoView.setVideoURI(uri);

        if (playback == false) {

            //Playing the video
            card3.animate().alpha(0);
            card3VideoView.animate().alpha(1);
            card3VideoView.start();

            card3VideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
            {
                @Override
                public void onCompletion(MediaPlayer mp3)
                {
                    // Video Playing is completed
                    card3.animate().alpha(1);
                    card3VideoView.animate().alpha(0);
                }
            });
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
        splashScreen.bringToFront();
        splashScreenTimer = new CountDownTimer(1000, 100) {
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