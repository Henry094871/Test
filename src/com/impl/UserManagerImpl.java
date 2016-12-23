package com.impl;

import java.util.ArrayList;
import java.util.List;

import com.logic.UserManager;
import com.pojo.User;

public class UserManagerImpl implements UserManager{

    @Override
    public int findExistedUser(String name) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<User> showUsers() {
        // TODO Auto-generated method stub
        List<User> list=new ArrayList<User>();
        list.add(new User("Henry","123"));
        return list;
    }

}
