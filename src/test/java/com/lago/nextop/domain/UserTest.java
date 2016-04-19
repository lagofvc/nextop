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
    public void testUserHasABinder(){
        List<Binder> binderList = classUnderTest.getBinderList();
        Assert.assertNotNull(binderList.get(0));
    }

    @Test
    public void testUserCanEditBinderName(){
        List<Binder> binderList = classUnderTest.getBinderList();
        Binder firstBinder = binderList.get(0);
        firstBinder.setBinderName("MY FIRST BINDER");

        List<Binder>binderListNew = classUnderTest.getBinderList();
        Assert.assertEquals("MY FIRST BINDER", binderListNew.get(0).getBinderName());
    }

    @Test
    public void testUserCanAddANoteToBinder(){
        Note firstNote = new Note();
        firstNote.setText("This is my first note ever, yo!");
        List<Binder> binderList = classUnderTest.getBinderList();
        Binder firstBinder = binderList.get(0);
        firstBinder.addNote(firstNote);

        List<Binder>binderListNew = classUnderTest.getBinderList();
        Assert.assertEquals("This is my first note ever, yo!", binderListNew.get(0).getBinderNotes().get(0).getText());
    }
}