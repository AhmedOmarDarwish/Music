package com.example.a3mr.music;



public class Songs {


    private String songname;
    private String songtime;
    private String singer;
    private int songicon;


    public Songs(String sname, String ssinger, String stime, int sicon) {
        songname = sname;
        songtime = stime;
        singer = ssinger;
        songicon = sicon;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
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