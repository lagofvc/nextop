package com.lago.nextop.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by lago on 4/3/16.
 */
public class NoteNextifierServiceTest {

    public NoteNextifierService classUnderTest;

    @Before
    public void setup(){
        classUnderTest = new NoteNextifierService();
    }

    @After
    public void tearDown(){
        classUnderTest = null;
    }

    @Test
    public void testCanSetNextItemOnNote(){
        assertTrue(false);
    }
}
