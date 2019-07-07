package com.codingbat.recursion;

public class CountHi {

    public static int countHi(String str) {
        if (str.length() > 1) {
            System.out.println(str + "   :   " + str.substring(0,2));
            int count = str.substring(0, 2).equalsIgnoreCase("hi") ? 1 : 0;
            return count + countHi(str.substring(1));
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(countHi("xxhixx"));
    }
}
