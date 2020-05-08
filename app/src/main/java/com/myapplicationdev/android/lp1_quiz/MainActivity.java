package com.myapplicationdev.android.lp1_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    ListView lvMood;
    EditText etMood;
    Button btnSubmit;
    ArrayAdapter aa;
    ArrayList<Mood> moodList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMood = findViewById(R.id.lvMood);
        etMood = findViewById(R.id.etMood);
        btnSubmit = findViewById(R.id.btnSubmit);
        moodList = new ArrayList<Mood>();


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mood = etMood.getText().toString();
                moodList.add(new Mood(mood,getDate()));
                aa = new MoodAdapter(MainActivity.this,R.layout.row,moodList);
                lvMood.setAdapter(aa);
                aa.notifyDataSetChanged();

            }
        });
    }

    protected String getDate(){
        Date c = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        String formattedDate = df.format(c);
        Log.i("Today's date : ", formattedDate);
        return formattedDate;
    }


}
