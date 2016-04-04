package com.lago.nextop.service;

import com.lago.nextop.NextAppException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.security.auth.login.LoginException;

/**
 * Created by lago on 3/23/16.
 */
public class LoginServiceTest {

    LoginService classUnderTest;

    @Before
    public void setup() throws NextAppException {
        this.classUnderTest = new LoginService();
    }

    @After
    public void tearDown(){
        this.classUnderTest = null;
    }

    @Test(expected = LoginException.class)
    public void testIncorrectLogin() throws LoginException{
        this.classUnderTest.loginUser("fakeUser", "fakePass");
    }

    @Test
    public void testSuccessfulLogin() throws LoginException{
        String result = this.classUnderTest.loginUser("vcruz", "password");
        Assert.assertNotNull(result);
    }
}
