package com.lago.nextop.domain;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by lago on 3/20/16.
 */
public class NextO {
    private Date created;
    private String href;

    public NextO(){
        created = Calendar.getInstance().getTime();
        href = buildObjectURL();
    }

    public Date getDateCreated() {
        return this.created;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    private String buildObjectURL() {
        //TODO: complete once DB access included
        //TODO: for now mocked.
        return "http://localhost:8080/nextapp/o/abc123";
    }
}