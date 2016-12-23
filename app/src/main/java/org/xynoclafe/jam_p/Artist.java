package org.xynoclafe.jam_p;

import java.util.ArrayList;

/**
 * Created by gokul on 23/12/16.
 */

public class Artist {

    private String name;
    private ArrayList<Song> songs;

    public Artist(String name) {

        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String toString(){
        return this.name;
    }

    public void addToList(Song song){

        this.songs.add(song);
    }
}
