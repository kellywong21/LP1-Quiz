package com.myapplicationdev.android.lp1_quiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MoodAdapter extends ArrayAdapter<Mood> {
    private ArrayList<Mood> moodList;
    private Context context;
    private TextView tvMood,tvDate;


    public MoodAdapter(Context context, int resource,ArrayList<Mood> objects) {
        super(context, resource, objects);
        moodList = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row,parent,false);

        tvMood = rowView.findViewById(R.id.tvMood);
        tvDate = rowView.findViewById(R.id.tvDate);

        Mood currentMood = moodList.get(position);
        tvMood.setText(currentMood.getMood());
        tvDate.setText(currentMood.getDateTime());

        return rowView;
    }
}
