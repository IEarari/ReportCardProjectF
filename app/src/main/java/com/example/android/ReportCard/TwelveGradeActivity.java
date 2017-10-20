package com.example.android.ReportCard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TwelveGradeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_twelve);
        ArrayList<TwelveGradeArray> twelvegrade = new ArrayList<TwelveGradeArray> ();
        twelvegrade.add(new TwelveGradeArray("Amr Abduldsalam",95 ,96, 97, 96));
        twelvegrade.add(new TwelveGradeArray("Yousef Aker",94 ,97.5, 98, 96.5));
        twelvegrade.add(new TwelveGradeArray("Akram Sbaih",96 ,97, 98, 97));
        twelvegrade.add(new TwelveGradeArray("Saif Alawneh",93,85, 80, 86));
        twelvegrade.add(new TwelveGradeArray("Basil Musmar",78 ,83, 91, 84));
        TwelveGradeArrayAdapter adapter = new TwelveGradeArrayAdapter(this, twelvegrade);
        ListView listView = (ListView) findViewById(R.id.listTwelve);
        listView.setAdapter(adapter);
    }
}