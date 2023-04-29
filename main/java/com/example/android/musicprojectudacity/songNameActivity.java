package com.example.android.musicprojectudacity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class songNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_name);


        TextView playlists = (TextView) findViewById(R.id.activity_playlist);

        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlists = new Intent(songNameActivity.this, PlaylistActivity.class);
                startActivity(playlists);
            }
        });
    }

}
