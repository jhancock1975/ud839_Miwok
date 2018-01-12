package com.example.android.miwok;

/**
 * Created by jhancock2010 on 1/7/18.
 */

public class Word {
    private String english;
    private String miwok;

    //integer to hold resource id
    //for images
    private Integer imgResId;

    //integer to hold background color
    private int bgColor;

    public Word(String english, String miwok, int imgResId, int bgColor) {
        this.english = english;
        this.miwok = miwok;
        this.imgResId = imgResId;
        this.bgColor=bgColor;
    }

    public Word(String english, String miwok, int bgColor) {
        this.english = english;
        this.miwok = miwok;
        this.bgColor=bgColor;
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

    public Integer getImgResId() {
        return imgResId;
    }

    public void setImgResId(Integer imgResId) {
        this.imgResId = imgResId;
    }

    public int getBgColor() {
        return bgColor;
    }
}
