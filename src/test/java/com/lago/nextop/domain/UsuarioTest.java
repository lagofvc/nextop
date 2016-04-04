package com.lago.nextop.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lago on 3/22/16.
 */
public class UsuarioTest {

    public Usuario classUnderTest;

    @Before
    public void setup(){
        classUnderTest  = new Usuario();
    }

    @After
    public void tearDown(){
        classUnderTest = null;
    }

    @Test
    public void testSuccessLoginGetsLoginID(){
    }
}
