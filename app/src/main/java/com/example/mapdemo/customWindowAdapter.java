package com.example.mapdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by supriya on 8/17/16.
 */
public class customWindowAdapter implements GoogleMap.InfoWindowAdapter {
    LayoutInflater mInflater;

    public customWindowAdapter(LayoutInflater i){
        mInflater = i;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        // Getting view from the layout file
        View v = mInflater.inflate(R.layout.custom_info_window, null);
        // Populate fields
        TextView title = (TextView) v.findViewById(R.id.tv_info_window_title);
        title.setText(marker.getTitle());

        TextView description = (TextView) v.findViewById(R.id.tv_info_window_description);
        description.setText(marker.getSnippet());
        // Return info window contents
        return v;
    }
}
