package com.lago.nextop.domain;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by lago on 3/22/16.
 */
public class UserTest {

    public User classUnderTest;

    @Before
    public void setup(){
        classUnderTest  = new User();
    }

    @After
    public void tearDown(){
        classUnderTest = null;
    }

    @Test
    public void testSuccessLoginGetsLoginID(){
    }

    @Test
    public void testUserHasABinder(){
        List<Binder> binderList = classUnderTest.getBinderList();
        Assert.assertNotNull(binderList.get(0));
    }
}
