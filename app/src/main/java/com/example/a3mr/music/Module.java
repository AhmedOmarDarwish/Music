package com.example.a3mr.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Module extends AppCompatActivity {
    boolean play = false;
    ImageButton playpause;
    TextView spnow;
    TextView sipnow;
    int index;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_module );
        spnow = findViewById( R.id.spnow );
        sipnow = findViewById( R.id.sipnow );
         listView = findViewById( R.id.list_item );
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        songs();
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

    public void songs() {

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            index = bundle.getInt( "types" );
        }
        final ArrayList <Songs> rocksongs = new ArrayList <>();
        rocksongs.add( new Songs( "Rock1 Song", "Singer1", "2:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock2 Song", "Singer2", "3:00", R.drawable.ic_music_note_black_24dp ) );
        rocksongs.add( new Songs( "Rock3 Song", "Singer3", "1:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock4 Song", "Singer4", "4:00", R.drawable.ic_music_note_black_24dp ) );
        rocksongs.add( new Songs( "Rock5 Song", "Singer5", "9:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock6 Song", "Singer6", "1:20", R.drawable.ic_music_note_black_24dp ) );
        rocksongs.add( new Songs( "Rock7 Song", "Singer7", "1:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock8 Song", "Singer8", "3:00", R.drawable.ic_music_note_black_24dp ) );
        rocksongs.add( new Songs( "Rock9 Song", "Singer9", "7:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock10 Song", "Singer10", "5:00", R.drawable.ic_music_note_black_24dp ) );

        final ArrayList <Songs> popsongs = new ArrayList <>();
        popsongs.add( new Songs( "Pop1 Song", "Singer1", "2:30", R.drawable.ic_headset_black_24dp ) );
        popsongs.add( new Songs( "Pop2 Song", "Singer2", "3:00", R.drawable.ic_music_note_black_24dp ) );
        popsongs.add( new Songs( "Pop3 Song", "Singer3", "2:30", R.drawable.ic_headset_black_24dp ) );
        popsongs.add( new Songs( "Pop4 Song", "Singer4", "3:00", R.drawable.ic_music_note_black_24dp ) );
        popsongs.add( new Songs( "Pop5 Song", "Singer5", "2:30", R.drawable.ic_headset_black_24dp ) );
        popsongs.add( new Songs( "Pop6 Song", "Singer6", "3:00", R.drawable.ic_music_note_black_24dp ) );
        popsongs.add( new Songs( "Pop7 Song", "Singer7", "2:30", R.drawable.ic_headset_black_24dp ) );
        popsongs.add( new Songs( "Pop8 Song", "Singer8", "3:00", R.drawable.ic_music_note_black_24dp ) );
        popsongs.add( new Songs( "Pop9 Song", "Singer9", "2:30", R.drawable.ic_headset_black_24dp ) );
        popsongs.add( new Songs( "Pop10 Song", "Singer10", "3:00", R.drawable.ic_music_note_black_24dp ) );


        final ArrayList <Songs> jazzsongs = new ArrayList <>();
        jazzsongs.add( new Songs( "Jazz1 Song", "Singer1", "2:30", R.drawable.ic_headset_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz2 Song", "Singer2", "3:00", R.drawable.ic_music_note_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz3 Song", "Singer3", "2:30", R.drawable.ic_headset_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz4 Song", "Singer4", "3:00", R.drawable.ic_music_note_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz5 Song", "Singer5", "2:30", R.drawable.ic_headset_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz6 Song", "Singer6", "3:00", R.drawable.ic_music_note_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz7 Song", "Singer7", "2:30", R.drawable.ic_headset_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz8 Song", "Singer8", "3:00", R.drawable.ic_music_note_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz9 Song", "Singer9", "2:30", R.drawable.ic_headset_black_24dp ) );
        jazzsongs.add( new Songs( "Jazz10 Song", "Singer10", "3:00", R.drawable.ic_music_note_black_24dp ) );

        final ArrayList <Songs> classicalsongs = new ArrayList <>();
        classicalsongs.add( new Songs( "Classical1 Song", "Singer1", "2:30", R.drawable.ic_headset_black_24dp ) );
        classicalsongs.add( new Songs( "Classical2 Song", "Singer2", "3:00", R.drawable.ic_music_note_black_24dp ) );
        classicalsongs.add( new Songs( "Classical3 Song", "Singer3", "2:30", R.drawable.ic_headset_black_24dp ) );
        classicalsongs.add( new Songs( "Classical4 Song", "Singer4", "3:00", R.drawable.ic_music_note_black_24dp ) );
        classicalsongs.add( new Songs( "Classical5 Song", "Singer5", "2:30", R.drawable.ic_headset_black_24dp ) );
        classicalsongs.add( new Songs( "Classical6 Song", "Singer6", "3:00", R.drawable.ic_music_note_black_24dp ) );
        classicalsongs.add( new Songs( "Classical7 Song", "Singer7", "2:30", R.drawable.ic_headset_black_24dp ) );
        classicalsongs.add( new Songs( "Classical8 Song", "Singer8", "3:00", R.drawable.ic_music_note_black_24dp ) );
        classicalsongs.add( new Songs( "Classical9 Song", "Singer9", "2:30", R.drawable.ic_headset_black_24dp ) );
        classicalsongs.add( new Songs( "Classical10 Song", "Singer10", "3:00", R.drawable.ic_music_note_black_24dp ) );


        if (index == 0) {
            CSongsAdapter Rock = new CSongsAdapter( this, rocksongs );
            listView.setAdapter( Rock );

            listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView <?> adapterView, View view, int position, long l) {
                    // Get the {@link Word} object at the given position the user clicked on
                    Songs song = rocksongs.get( position );
                    spnow.setText( song.getSongname() );
                    sipnow.setText( song.getSinger() );


                }
            } );

        } else if (index == 1) {
            CSongsAdapter Popsongs = new CSongsAdapter( this, popsongs );
            listView.setAdapter( Popsongs );
            listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView <?> adapterView, View view, int position, long l) {
                    // Get the {@link Word} object at the given position the user clicked on
                    Songs song = popsongs.get( position );
                    spnow.setText( song.getSongname() );
                    sipnow.setText( song.getSinger() );


                }
            } );
        } else if (index == 2) {
            CSongsAdapter Jazz = new CSongsAdapter( this, jazzsongs );
            listView.setAdapter( Jazz );
            listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView <?> adapterView, View view, int position, long l) {
                    // Get the {@link Word} object at the given position the user clicked on
                    Songs song = jazzsongs.get( position );
                    spnow.setText( song.getSongname() );
                    sipnow.setText( song.getSinger() );


                }
            } );
        } else if (index == 3) {
            CSongsAdapter Classical = new CSongsAdapter( this, classicalsongs );
            listView.setAdapter( Classical );
            listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView <?> adapterView, View view, int position, long l) {
                    // Get the {@link Word} object at the given position the user clicked on
                    Songs song = classicalsongs.get( position );
                    spnow.setText( song.getSongname() );
                    sipnow.setText( song.getSinger() );


                }
            } );
        }
    }
}