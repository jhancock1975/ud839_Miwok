package com.example.android.miwok;

/**
 * Created by jhancock2010 on 1/7/18.
 */

public class Word {
    private String english;
    private String miwok;
    private int imgResId;

    public Word(String english, String miwok, int imgResId) {
        this.english = english;
        this.miwok = miwok;
        this.imgResId = imgResId;
    }

    public Word(String english, String miwok) {
        this.english = english;
        this.miwok = miwok;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMiwok() {
        return miwok;
    }

    public void setMiwok(String miwok) {
        this.miwok = miwok;
    }

    public int getImgResId() {
        return imgResId;
    }

    public void setImgResId(int imgResId) {
        this.imgResId = imgResId;
    }
}
