package com.example.atlas.mygson.com.example.atlas.mygson.bean;

import android.nfc.Tag;

import java.util.ArrayList;

/**
 * Created by Atlas on 15/12/13.
 */
public class Book {
    private String title;
    private String publisher;
    private String summary;
//    private ArrayList<Tag> tags;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

//    public ArrayList<Tag> getTags() {
//        return tags;
//    }
//
//    public void setTags(ArrayList<Tag> tags) {
//        this.tags = tags;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
