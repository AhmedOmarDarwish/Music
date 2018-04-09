package com.example.a3mr.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PlayMusic extends AppCompatActivity {
    ImageButton playpause2;
    ImageButton home;
    ImageButton back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_play_music );

        playpause2 = findViewById( R.id.play_pause2 );
        Module p = new Module();
        p.playandpause( playpause2 );

        home = findViewById( R.id.home );
        home.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent( PlayMusic.this, MainActivity.class );
                startActivity( home );


            }
        } );

        back2 = findViewById( R.id.back2 );
        back2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent( PlayMusic.this, Module.class );
                startActivity( home );


            }
        } );


    }
}
