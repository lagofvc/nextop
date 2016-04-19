package com.lago.nextop.domain;

import java.util.ArrayList;

/**
 * Created by lago on 3/20/16.
 */
public class Binder extends NextO {

    private String binderName;
    private ArrayList<Note> binderNotes;

    protected Binder(String name){
    }

    public String getBinderName() {
        return binderName;
    }

    public void setBinderName(String binderName) {
        this.binderName = binderName;
    }

    public void addNote(Note firstNote) {
        if(null == binderNotes){
            binderNotes = new ArrayList<>();
        }
        binderNotes.add(firstNote);
    }

    public ArrayList<Note> getBinderNotes() {
        return binderNotes;
    }
}