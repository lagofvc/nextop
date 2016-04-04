package com.lago.nextop.service.adapter.base;

import javax.security.auth.login.LoginException;

/**
 * Created by lago on 4/3/16.
 */
public interface LoginAdapterIF {
    String userLogin(String username, String password) throws LoginException;
}
