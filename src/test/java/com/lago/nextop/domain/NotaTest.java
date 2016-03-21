package com.lago.nextop.domain;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by lago on 3/20/16.
 */
public class NotaTest {

    public Nota classUnderTest;

    @Before
    public void setup(){
        classUnderTest = new Nota();
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
    public void testCreateDateIsPast(){
        try{
            Thread.sleep(100);
        }catch(InterruptedException ie){
        }
        long now = System.currentTimeMillis();

        assertTrue(now > classUnderTest.getDateCreated().getTime());
    }
}
