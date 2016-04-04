package com.lago.nextop.service.adapter.evernote;

import com.lago.nextop.NextAppException;
import com.lago.nextop.service.adapter.base.LoginAdapterIF;

import javax.security.auth.login.LoginException;

/**
 * Created by lago on 4/3/16.
 */
public class EvernoteLoginAdapter implements LoginAdapterIF {

    private static EvernoteOperationsUtils UTILS;

    public EvernoteLoginAdapter() throws NextAppException {
        UTILS = new EvernoteOperationsUtils();
    }

    @Override
    public String userLogin(String username, String password) throws LoginException {
        return UTILS.userLogin(username, password);
    }
}