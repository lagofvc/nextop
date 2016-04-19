package com.lago.nextop.domain;

import org.junit.After;
import org.junit.Before;

/**
 * Created by lago on 3/20/16.
 */
public class NoteTest {

    public Note classUnderTest;

    @Before
    public void setup(){
        classUnderTest = new Note();
    }

    @After
    public void tearDown(){
        classUnderTest = null;
    }
}
