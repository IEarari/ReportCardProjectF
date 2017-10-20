package com.example.android.ReportCard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.android.ReportCard.R;

import java.util.ArrayList;

public class TenGradeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_ten);
        ArrayList<TenGradeArray> tengrade = new ArrayList<TenGradeArray>();
        tengrade.add(new TenGradeArray("Ibraheem Earari",95 ,96, 97, 96));
        tengrade.add(new TenGradeArray("Abdullah Earari",94 ,97.5, 98, 96.5));
        tengrade.add(new TenGradeArray("Mohammed Fathi",96 ,97, 98, 97));
        tengrade.add(new TenGradeArray("Alex Tayem",93,85, 80, 86));
        tengrade.add(new TenGradeArray("Zaied Samer",78 ,83, 91, 84));
        TenGradeArrayAdapter adapter = new TenGradeArrayAdapter(this, tengrade);
        ListView listView = (ListView) findViewById(R.id.listTen);
        listView.setAdapter(adapter);
    }
}