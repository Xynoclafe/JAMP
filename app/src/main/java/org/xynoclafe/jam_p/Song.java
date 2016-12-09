package org.xynoclafe.jam_p;

/**
 * Created by gokul on 8/12/16.
 */

public class Song {

    private long id;
    private String title;
    private String artist;


    public Song(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
}

