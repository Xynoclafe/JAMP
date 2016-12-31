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
 * Created by gokul on 23/12/16.
 */

public class ArtistAdapter extends BaseAdapter {

    private ArrayList<Artist> artists;
    private LayoutInflater artistsinf;

    public ArtistAdapter(Context context, ArrayList<Artist> artist){
        artists=artist;
        artistsinf=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return artists.size();
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
        LinearLayout artistLay = (LinearLayout)artistsinf.inflate
                (R.layout.artist, parent, false);
        //get title and artist views
        TextView name = (TextView)artistLay.findViewById(R.id.artist_name);
        //get song using position
        Artist curArtist = artists.get(position);
        //get title and artist strings
        name.setText(curArtist.toString());
        //set position as tag
        artistLay.setTag(curArtist.toString());
        return artistLay;
    }

}
