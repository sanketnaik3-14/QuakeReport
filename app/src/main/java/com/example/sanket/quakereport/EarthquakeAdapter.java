package com.example.sanket.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sanket on 25/02/17.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes)
    {
        super(context,0,earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.quake, parent, false);
        }

        Earthquake current_earthquake = getItem(position);

        TextView magnitude = (TextView)listItemView.findViewById(R.id.magnitude);
        magnitude.setText(current_earthquake.getMagnitude());

        TextView location = (TextView)listItemView.findViewById(R.id.location);
        location.setText(current_earthquake.getLocation());

        TextView date = (TextView)listItemView.findViewById(R.id.date);
        date.setText(current_earthquake.getDate());

        return listItemView;
    }
}
