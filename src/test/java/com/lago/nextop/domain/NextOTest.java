package com.lago.nextop.domain;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by valentino on 4/18/16.
 */
public class NextOTest {

    public NextO classUnderTest;

    @Before
    public void setup(){
        classUnderTest = new NextO();
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

    @Test
    public void testNextOHasHref(){
        Assert.assertNotNull(classUnderTest.getHref());
    }
}
