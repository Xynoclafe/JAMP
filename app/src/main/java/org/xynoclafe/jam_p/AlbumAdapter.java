package org.xynoclafe.jam_p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gokul on 30/12/16.
 */

public class AlbumAdapter extends BaseAdapter {

    private ArrayList<Album> albums;
    private LayoutInflater albumsinf;

    public AlbumAdapter(Context context, ArrayList<Album> album){
        albums=album;
        albumsinf=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return albums.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout albumLay = (LinearLayout)albumsinf.inflate
                (R.layout.album, parent, false);
        //create TextView for album name
        TextView name = (TextView)albumLay.findViewById(R.id.album_name);
        //create TextView for artist name
        TextView artist = (TextView)albumLay.findViewById(R.id.album_artist);
        //get album using position
        Album curAlbum = albums.get(position);
        //set album name in layout
        name.setText(curAlbum.toString());
        //set artist name in layout
        artist.setText(curAlbum.getArtistName());
        //set position as tag
        albumLay.setTag(position);
        return albumLay;
    }
}
