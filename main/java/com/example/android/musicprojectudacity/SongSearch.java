package com.example.android.musicprojectudacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_search);

        TextView musicStore = (TextView) findViewById(R.id.activity_music_store);

        musicStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicStore = new Intent(SongSearch.this, MusicStoreActivity.class);
                startActivity(musicStore);
            }
        });
    }
}
