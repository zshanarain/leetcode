package com.codingbat.recursion;

public class ChangePi {

    public static String changePi(String str) {
        if (str.length() > 1) {
            if (str.substring(0,2).equalsIgnoreCase("pi")) {
                return "3.14".concat(changePi(str.substring(2)));
            }
            return  str.substring(0,1).concat(changePi(str.substring(1)));
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(changePi("xpix"));
        System.out.println(changePi("pipi"));
        System.out.println(changePi("pip"));
    }
}
