package com.myapplicationdev.android.lp1_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondPage extends AppCompatActivity {
    TextView tvDate,tvMood;
    Button btnEmail;
    ArrayList<Mood>mood;
    String date,moods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        tvDate = findViewById(R.id.tvDate);
        tvMood = findViewById(R.id.tvMood);
        btnEmail = findViewById(R.id.btnEmail);

        Intent getIntent = getIntent();
        Mood mood = (Mood)getIntent.getSerializableExtra("position");
        date = mood.getDateTime();
        moods = mood.getMood();
        tvDate.setText(date);
        tvMood.setText(moods);

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{"jason_lim@rp.edu.sg"});
                email.putExtra(Intent.EXTRA_TEXT,"Date created: " + date + "\n" + moods);
                email.putExtra(Intent.EXTRA_SUBJECT,"LP1-Quiz 18004885");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email,"Choose an email client: "));
            }
        });
    }
}
