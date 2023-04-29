package com.example.android.musicprojectudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MusicStoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_store);


        TextView songSearch = (TextView) findViewById(R.id.activity_song_search);

        songSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songSearch = new Intent(MusicStoreActivity.this, SongSearch.class);
                startActivity(songSearch);
            }
        });
    }
}
