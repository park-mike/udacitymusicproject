package com.example.android.musicprojectudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);


        TextView songs = (TextView) findViewById(R.id.activity_song_name);

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songs = new Intent(PlaylistActivity.this, songNameActivity.class);
                startActivity(songs);
            }
        });
    }

}


