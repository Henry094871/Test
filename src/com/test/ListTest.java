package com.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        
        List<Integer> list=new ArrayList<Integer>();
        for (int i=0;i<10;i++) {
            list.add(i);
        }
        for (Integer i:list) {
            System.out.print(i+",");
        }
        System.out.println();
        Integer temp=list.remove(6);
        for (Integer i:list) {
            System.out.print(i+",");
        }
        System.out.println();
        
        list.add(1, temp);
        
        for (Integer i:list) {
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println(list.size());
    }
}
