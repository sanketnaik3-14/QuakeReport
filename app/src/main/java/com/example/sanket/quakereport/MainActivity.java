package com.example.sanket.quakereport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.lang.String;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Earthquake> earthquake = new ArrayList<Earthquake>();

        earthquake.add(new Earthquake("7.2","San Francisco","Feb 2, 2016"));
        earthquake.add(new Earthquake("6.1","London","July 20, 2015"));
        earthquake.add(new Earthquake("3.9","Tokyo","Nov 10, 2014"));
        earthquake.add(new Earthquake("3.9","Tokyo","Nov 10, 2014"));
        earthquake.add(new Earthquake("2.8","Moscow","Jan 31, 2013"));
        earthquake.add(new Earthquake("4.9","Rio de Janerio","Aug 19, 2012"));
        earthquake.add(new Earthquake("1.6","Paris","Oct 30, 2011"));

        EarthquakeAdapter adapter = new EarthquakeAdapter(this ,earthquake);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
