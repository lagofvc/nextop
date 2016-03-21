package com.lago.nextop.domain;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import java.util.Calendar;

import static org.junit.Assert.*;

/**
 * Created by lago on 3/20/16.
 */
public class NoteObjectTest {

    public Note classUnderTest;

    @Before
    public void setup(){
        classUnderTest = new Note();
    }

    @After
    public void tearDown(){
        classUnderTest = null;
    }

    @Test
    public void testSetCreateDateOnInstantiation(){
        assertNotNull(classUnderTest.getDateCreated());
    }

    @Test
    public void testCreateDateIsInThePast(){
        try{
            Thread.sleep(100);
        }catch(InterruptedException ie){

        }
        long now = System.currentTimeMillis();

        assertTrue(now > classUnderTest.getDateCreated().getTime());
    }
}
