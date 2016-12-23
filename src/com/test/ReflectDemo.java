package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.pojo.User;

public class ReflectDemo {

    public static void main(String[] args) throws Exception {
        
        ClassLoader load=Thread.currentThread().getContextClassLoader();
        System.out.println("current loader:"+load);
        System.out.println("parent loader:"+load.getParent());
        System.out.println("grandparent loader:"+load.getParent().getParent());
        
        Class<User> clazz=null;
        try {
            clazz=(Class<User>) load.loadClass("com.pojo.User");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
       
        //User user=clazz.newInstance();
        Constructor cons=clazz.getDeclaredConstructor((Class[]) null);
        User user=(User) cons.newInstance();
        
        Field nameField=clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(user, "Tom");
        System.out.println(user.getName());
        
        Method setName=clazz.getMethod("setName", String.class);
        System.out.println(setName.getReturnType());
        
        Method setPassword=clazz.getMethod("setPassword", String.class);
        setName.invoke(user, "Henry");
        setPassword.invoke(user, "password");
        
        System.out.println(user);
    }
}
