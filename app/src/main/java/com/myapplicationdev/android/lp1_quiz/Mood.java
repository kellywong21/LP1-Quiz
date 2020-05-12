package com.myapplicationdev.android.lp1_quiz;

public class Mood {
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
