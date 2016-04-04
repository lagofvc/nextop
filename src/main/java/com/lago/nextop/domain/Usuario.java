package com.lago.nextop.domain;

import javax.security.auth.login.LoginException;

/**
 * Created by lago on 3/22/16.
 */
public class Usuario extends NextopObject {

    private String loginId;

    public Usuario(){

    }

    public String login(String username, String password) {
        //TODO: Add login logic, for now we simulate success
        loginId = "FakeLoginID";
        return loginId;
    }

    public String getLoginId() {
        return loginId;
    }
}
