package com.example.a3mr.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Module extends AppCompatActivity {
       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_module );
           ListView listView =  findViewById( R.id.list_item );
        ArrayList<Songs> rocksongs = new ArrayList <>();
        rocksongs.add( new Songs( "Rock1 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock2 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
        rocksongs.add( new Songs( "Rock3 Song", "1:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock4 Song", "4:00", R.drawable.ic_music_note_black_24dp ) );
        rocksongs.add( new Songs( "Rock5 Song", "9:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock6 Song", "1:20", R.drawable.ic_music_note_black_24dp ) );
        rocksongs.add( new Songs( "Rock7 Song", "1:30", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock8 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
        rocksongs.add( new Songs( "Rock9 Song", "730", R.drawable.ic_headset_black_24dp ) );
        rocksongs.add( new Songs( "Rock10 Song", "5:00", R.drawable.ic_music_note_black_24dp ) );

           ArrayList <Songs> popsongs = new ArrayList <>();
           popsongs.add( new Songs( "Pop1 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           popsongs.add( new Songs( "Pop2 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
           popsongs.add( new Songs( "Pop3 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           popsongs.add( new Songs( "Pop4 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
           popsongs.add( new Songs( "Pop5 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           popsongs.add( new Songs( "Pop6 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
           popsongs.add( new Songs( "Pop7 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           popsongs.add( new Songs( "Pop8 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
           popsongs.add( new Songs( "Pop9 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           popsongs.add( new Songs( "Pop10 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );


           ArrayList <Songs> jazzsongs = new ArrayList <>();
           jazzsongs.add( new Songs( "Jazz1 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           jazzsongs.add( new Songs( "Jazz2 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
           jazzsongs.add( new Songs( "Jazz3 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           jazzsongs.add( new Songs( "Jazz4 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
           jazzsongs.add( new Songs( "Jazz5 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           jazzsongs.add( new Songs( "Jazz6 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
           jazzsongs.add( new Songs( "Jazz7 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           jazzsongs.add( new Songs( "Jazz8 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
           jazzsongs.add( new Songs( "Jazz9 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           jazzsongs.add( new Songs( "Jazz10 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );


           ArrayList <Songs> classicalsongs = new ArrayList <>();
           classicalsongs.add( new Songs( "Classical1 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           classicalsongs.add( new Songs( "Classical2 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
           classicalsongs.add( new Songs( "Classical3 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           classicalsongs.add( new Songs( "Classical4 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
           classicalsongs.add( new Songs( "Classical5 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           classicalsongs.add( new Songs( "Classical6 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
           classicalsongs.add( new Songs( "Classical7 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           classicalsongs.add( new Songs( "Classical8 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );
           classicalsongs.add( new Songs( "Classical9 Song", "2:30", R.drawable.ic_headset_black_24dp ) );
           classicalsongs.add( new Songs( "Classical10 Song", "3:00", R.drawable.ic_music_note_black_24dp ) );

           int index ;
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

}