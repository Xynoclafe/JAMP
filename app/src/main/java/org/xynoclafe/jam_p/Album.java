package org.xynoclafe.jam_p;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by gokul on 30/12/16.
 */

public class Album implements Serializable {

    private String name;
    private String artistName;
    private ArrayList<Song> songs;

    public Album(String name, String artistName) {

        this.name = name;
        this.artistName = artistName;
        this.songs = new ArrayList<Song>();
    }

    public String toString(){
        return this.name;
    }

    public void addToList(Song song){

        this.songs.add(song);
    }

    public String getArtistName(){
        return artistName;
    }
}
