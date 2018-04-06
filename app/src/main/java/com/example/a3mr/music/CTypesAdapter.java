package com.example.a3mr.music;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CTypesAdapter extends ArrayAdapter {
    public CTypesAdapter(@NonNull Context context, ArrayList <Types> songstypes) {
        super( context, 0, songstypes );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.activity_types, parent, false );
        }
        Types currentSongsAdapter = (Types) getItem( position );
        TextView songstypes = listItemView.findViewById( R.id.types );
        songstypes.setText( currentSongsAdapter.getImagename() );

        TextView music = listItemView.findViewById( R.id.music );
        music.setText( currentSongsAdapter.getMusic() );

        ImageView image = listItemView.findViewById( R.id.image );
        image.setImageResource( currentSongsAdapter.getImageid() );
        return listItemView;
    }
}
