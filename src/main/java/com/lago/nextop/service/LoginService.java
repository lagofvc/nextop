package com.lago.nextop.service;

import com.lago.nextop.NextAppException;
import com.lago.nextop.service.adapter.base.LoginAdapterIF;
import com.lago.nextop.service.adapter.evernote.EvernoteLoginAdapter;

import javax.security.auth.login.LoginException;

/**
 * Created by lago on 3/23/16.
 */
public class LoginService {

    private LoginAdapterIF LOGIN_ADAPTER;

    public LoginService() throws NextAppException {
        LOGIN_ADAPTER = new EvernoteLoginAdapter();
    }

    public  String loginUser(String username, String password) throws LoginException {
        return LOGIN_ADAPTER.userLogin(username, password);
    }
}
