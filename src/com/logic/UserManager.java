package com.logic;

import java.util.List;

import com.pojo.User;

public interface UserManager {

    public int findExistedUser(String name);
    
    public List<User> showUsers();
}
