package com.example.a3mr.music;



public class Types {


    private int imageid;
    private String imagename;
    private String music;

    public Types(String imgname, String mus, int imgid) {
        imageid = imgid;
        imagename = imgname;
        music = mus;

    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public int getImageid() {
        return imageid;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }
}