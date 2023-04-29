package com.example.android.musicprojectudacity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView store = (TextView) findViewById(R.id.activity_music_store);

        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeIntent = new Intent(MainActivity.this, MusicStoreActivity.class);
                startActivity(storeIntent);
            }
        });

        TextView playlist = (TextView) findViewById(R.id.activity_playlist);

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        TextView songSearch = (TextView) findViewById(R.id.activity_song_search);

        songSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SongSearch.class);
                startActivity(searchIntent);
            }
        });

        TextView songName = (TextView) findViewById(R.id.activity_song_name);

        songName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songName = new Intent(MainActivity.this, songNameActivity.class);
                startActivity(songName);
            }
        });
    }

}

/**
 * MusicStoreActivity.setOnClickListener(new.View.OnClickListener() {
 *
 * @Override public void onClick(View view) {
 * Toast.makeText(view.getContext(), "toast text music store", Toast.LENGTH_SHORT).show();
 * }
 * });
 **/



