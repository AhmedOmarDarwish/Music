package com.example.a3mr.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Module extends AppCompatActivity {
    boolean play = false;
    ImageButton playpause;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        setContentView( R.layout.activity_module );
        ImageView playmusicicon = findViewById( R.id.song_play_icon );
        playmusicicon.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityplaymusic = new Intent( Module.this, PlayMusic.class );
                startActivity( activityplaymusic );
            }
        } );
        playpause = findViewById( R.id.play_pause );
        playandpause( playpause );
        back = findViewById( R.id.back );
        back.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent( Module.this, MainActivity.class );
                startActivity( home );


            }
        } );

        ListView listView = findViewById( R.id.list_item );
        ArrayList <Songs> rocksongs = new ArrayList <>();
        rocksongs.add( new Songs( "Rock1 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock2 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        rocksongs.add( new Songs( "Rock3 Song", "Singer", "1:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock4 Song", "Singer", "4:00", R.drawable.ic_music_note_black_24dp ) );
        rocksongs.add( new Songs( "Rock5 Song", "Singer", "9:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock6 Song", "Singer", "1:20", R.drawable.ic_music_note_black_24dp ) );
        rocksongs.add( new Songs( "Rock7 Song", "Singer", "1:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock8 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        rocksongs.add( new Songs( "Rock9 Song", "Singer", "7:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock10 Song", "Singer", "5:00", R.drawable.ic_music_note_black_24dp ) );

        ArrayList <Songs> popsongs = new ArrayList <>();
        popsongs.add( new Songs( "Pop1 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        popsongs.add( new Songs( "Pop2 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        popsongs.add( new Songs( "Pop3 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        popsongs.add( new Songs( "Pop4 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        popsongs.add( new Songs( "Pop5 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        popsongs.add( new Songs( "Pop6 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        popsongs.add( new Songs( "Pop7 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        popsongs.add( new Songs( "Pop8 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        popsongs.add( new Songs( "Pop9 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        popsongs.add( new Songs( "Pop10 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );


        ArrayList <Songs> jazzsongs = new ArrayList <>();
        jazzsongs.add( new Songs( "Jazz1 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz2 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz3 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz4 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz5 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz6 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz7 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz8 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz9 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz10 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );

        ArrayList <Songs> classicalsongs = new ArrayList <>();
        classicalsongs.add( new Songs( "Classical1 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        classicalsongs.add( new Songs( "Classical2 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        classicalsongs.add( new Songs( "Classical3 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        classicalsongs.add( new Songs( "Classical4 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        classicalsongs.add( new Songs( "Classical5 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        classicalsongs.add( new Songs( "Classical6 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        classicalsongs.add( new Songs( "Classical7 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        classicalsongs.add( new Songs( "Classical8 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );
        classicalsongs.add( new Songs( "Classical9 Song", "Singer", "2:30", R.drawable.ic_headset_black_24dp ) );
        classicalsongs.add( new Songs( "Classical10 Song", "Singer", "3:00", R.drawable.ic_music_note_black_24dp ) );

        int index;
        Bundle bundle = getIntent().getExtras();
        index = bundle.getInt( "types" );
        if (index == 0) {
            CSongsAdapter Rock = new CSongsAdapter( this, rocksongs );
            listView.setAdapter( Rock );
        } else if (index == 1) {
            CSongsAdapter Popsongs = new CSongsAdapter( this, popsongs );
            listView.setAdapter( Popsongs );
        } else if (index == 2) {
            CSongsAdapter Jazz = new CSongsAdapter( this, jazzsongs );
            listView.setAdapter( Jazz );
        } else if (index == 3) {
            CSongsAdapter Classical = new CSongsAdapter( this, classicalsongs );
            listView.setAdapter( Classical );
        }
    }

    public void playandpause(ImageButton btn) {
        playpause = btn;
        playpause.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (play) {
                    playpause.setImageResource( R.drawable.play );
                    play = false;
                } else {
                    playpause.setImageResource( R.drawable.pause );
                    play = true;
                }
            }
        } );
    }
}