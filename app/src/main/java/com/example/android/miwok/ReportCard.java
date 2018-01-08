package com.example.android.miwok;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jhancock2010 on 1/7/18.
 *
 * This code is to satisfy the requirements
 * of lesson 3 of UD 389 to create a report card class
 */

public class ReportCard {


    String mathGrade;
    String englishGrade;
    String chemistryGrade;
    String peGrade;
    String musicGrade;
    String artGrade;
    String spanishGrade;

    public ReportCard(){

    }

    public ReportCard(String mathGrade, String englishGrade, String chemistryGrade, String peGrade, String musicGrade, String artGrade, String spanishGrade) {
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.chemistryGrade = chemistryGrade;
        this.peGrade = peGrade;
        this.musicGrade = musicGrade;
        this.artGrade = artGrade;
        this.spanishGrade = spanishGrade;
    }

    public String getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(String mathGrade) {
        this.mathGrade = mathGrade;
    }

    public String getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(String englishGrade) {
        this.englishGrade = englishGrade;
    }

    public String getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(String chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public String getPeGrade() {
        return peGrade;
    }

    public void setPeGrade(String peGrade) {
        this.peGrade = peGrade;
    }

    public String getMusicGrade() {
        return musicGrade;
    }

    public void setMusicGrade(String musicGrade) {
        this.musicGrade = musicGrade;
    }

    public String getArtGrade() {
        return artGrade;
    }

    public void setArtGrade(String artGrade) {
        this.artGrade = artGrade;
    }

    public String getSpanishGrade() {
        return spanishGrade;
    }

    public void setSpanishGrade(String spanishGrade) {
        this.spanishGrade = spanishGrade;
    }

    @Override
    public String toString() {
        return "ReportCard:" +
                "\nmathGrade='" + mathGrade + '\'' +
                ",\n englishGrade='" + englishGrade + '\'' +
                ",\n chemistryGrade='" + chemistryGrade + '\'' +
                ",\n peGrade='" + peGrade + '\'' +
                ",\n musicGrade='" + musicGrade + '\'' +
                ",\n artGrade='" + artGrade + '\'' +
                ",\n and spanishGrade='" + spanishGrade + "\'.";
    }
}
