package com.example.android.ReportCard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TwelveGradeArrayAdapter extends ArrayAdapter<TwelveGradeArray> {
    private static final String LOG_TAG = ElevenGradeArrayAdapter.class.getSimpleName();

    public TwelveGradeArrayAdapter(Activity context, ArrayList<TwelveGradeArray> Word) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Word);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            TwelveGradeArray currentWord = getItem(position);
            TextView Name = (TextView) listItemView.findViewById(R.id.Name);
            Name.setText(currentWord.getmStudent ());
            TextView Math = (TextView) listItemView.findViewById(R.id.Marks);
            Math.setText("Math Mark :"+currentWord.getMath ()+"\nChemistry Mark :"+currentWord.getChem ()+"\nPhysics Mark :"+currentWord.getPhy ()+" \nAvarage:"+currentWord.getAvg ());
        }
        return listItemView;
    }

}
