package com.lago.nextop.domain;

/**
 * Created by lago on 3/20/16.
 */
public class Note extends NextO {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
