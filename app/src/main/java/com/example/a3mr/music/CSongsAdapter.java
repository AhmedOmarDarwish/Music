package com.example.a3mr.music;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CSongsAdapter extends ArrayAdapter {
    public CSongsAdapter(@NonNull Context context, ArrayList <Songs> songslist) {
        super( context, 0, songslist );
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.activity_songs, parent, false );
        }
        Songs currentSongsAdapter = (Songs) getItem( position );
        TextView songname = listItemView.findViewById( R.id.song_name);
        songname.setText( currentSongsAdapter.getSongname() );

        TextView songtime =  listItemView.findViewById( R.id.song_time );
        songtime.setText( currentSongsAdapter.getSongtime() );

        ImageView songicon =  listItemView.findViewById( R.id.song_icon );
        songicon.setImageResource( currentSongsAdapter.getSongicon() );
        return listItemView;
    }
}
