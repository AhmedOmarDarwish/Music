package com.example.a3mr.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_songs );
    }
        private String songname;
        private String songtime;
        private int songicon;

    public Songs(String sname, String stime, int sicon) {
            songname = sname;
            songtime = stime;
            songicon = sicon;
        }

        public String getSongname() {
            return songname;
        }

        public int getSongicon() {
            return songicon;
        }

        public String getSongtime() {
            return songtime;
        }

        public void setSongtime(String songtime) {
            this.songtime = songtime;
        }

        public void setSongicon(int songicon) {
            this.songicon = songicon;
        }

        public void setSongname(String songname) {
            this.songname = songname;
        }
    }