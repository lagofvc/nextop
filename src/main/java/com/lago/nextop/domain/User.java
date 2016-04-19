package com.lago.nextop.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lago on 3/22/16.
 */
public class User extends NextO {

    private String loginId;
    private ArrayList<Binder> binders;

    public User(){
        binders = new ArrayList<>();
        binders.add(new Binder("things"));
    }

    public String login(String username, String password) {
        //TODO: Add login logic, for now we simulate success
        loginId = "FakeLoginID";
        return loginId;
    }

    public String getLoginId() {
        return loginId;
    }

    public List<Binder> getBinderList() {
        return binders;
    }
}
