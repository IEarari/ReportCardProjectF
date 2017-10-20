package com.example.android.ReportCard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ElevenGradeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_eleven);
        ArrayList<ElevenGradeArray> elevenGrade = new ArrayList<ElevenGradeArray> ();
        elevenGrade.add(new ElevenGradeArray("Oday Maqbool",95 ,96, 97, 96));
        elevenGrade.add(new ElevenGradeArray("Maya Abu-Arayes",94 ,97.5, 98, 96.5));
        elevenGrade.add(new ElevenGradeArray("Sara Abdulhadi",96 ,97, 98, 97));
        elevenGrade.add(new ElevenGradeArray("Ramz Smadi",93,85, 80, 86));
        elevenGrade.add(new ElevenGradeArray("Fadi Slameh",78 ,83, 91, 84));
        ElevenGradeArrayAdapter adapter = new ElevenGradeArrayAdapter(this, elevenGrade);
        ListView listView = (ListView) findViewById(R.id.listEleven);
        listView.setAdapter(adapter);
    }
}