package com.myapplicationdev.android.lp1_quiz;

import java.io.Serializable;

public class Mood implements Serializable {
    private String mood;
    private String dateTime;

    public Mood(String mood, String dateTime) {
        this.mood = mood;
        this.dateTime = dateTime;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
