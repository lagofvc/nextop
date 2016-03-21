package com.lago.nextop.domain;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by lago on 3/20/16.
 */
public class NextopObject {
    private Date created;

    public NextopObject(){
        created = Calendar.getInstance().getTime();
    }

    public Date getDateCreated() {
        return this.created;
    }
}