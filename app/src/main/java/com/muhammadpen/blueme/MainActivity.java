package com.muhammadpen.blueme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.VideoView;
//Imports for youtube
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;


public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    //Activating youtube functionality through API key
    public final class Config {

        private Config() {
        }

        public static final String YOUTUBE_API_KEY = "AIzaSyCR4SeoSZOZI9q2FAtdch6_Y03nX1nAlDo";

    }

    //Initializing the views
    EditText searchEditText = null;
    ImageButton searchButton = null;
    YouTubePlayerView vid1 = null;
    YouTubePlayerView vid2 = null;
    YouTubePlayerView vid3 = null;
    ScrollView scrollView = null;
    private static final int RECOVERY_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //Defining the views
        searchEditText = findViewById(R.id.searchEditText);
        searchButton = findViewById(R.id.searchButton);
        scrollView = findViewById(R.id.scrollView);

    }

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer youTubePlayer, boolean b) {

    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}