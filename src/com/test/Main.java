package com.test;

public class Main {

    public static void main(String[] args) {

        String s = "1-3,5,8,9-13,15-20";
        int n = 21;

        System.out.println(isExist(s, n));
        System.out.println(System.currentTimeMillis());

    }

    private static String isExist(String s, int n) {
        // TODO Auto-generated method stub
        String[] strArr = s.split(",");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > 1) {
                String[] temp = strArr[i].split("-");
                if (Integer.parseInt(temp[0]) <= n && Integer.parseInt(temp[1]) >= n) {
                    return "YES";
                }
            } else {
                if (Integer.parseInt(strArr[i]) == n) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

}
