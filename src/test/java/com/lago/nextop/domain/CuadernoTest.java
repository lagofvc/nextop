package com.lago.nextop.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lago on 3/20/16.
 */
public class CuadernoTest {

    public Cuaderno classUnderTest;

    @Before
    public void setup(){
        classUnderTest = new Cuaderno();
    }

    @After
    public void tearDown(){
        classUnderTest = null;
    }

    @Test
    public void hasAValidCreateDate(){
        assert(System.currentTimeMillis() > classUnderTest.getDateCreated().getTime());
    }
}
