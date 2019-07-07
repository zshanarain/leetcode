package com.codingbat.recursion;

public class ParentBit {

    private static String parentBit(String str, int index, int startIndex) {
       if (index < str.length()) {
           if (str.charAt(index) == '(') {
               startIndex = index;
           }

           if(str.charAt(index) == ')') {
               return  str.substring(startIndex, index+1);
           }

           return parentBit(str, index+1, startIndex);
       }
        return "";
    }

    public static String parentBit(String str) {
        if (str != null && str.length() > 1) {
           return parentBit(str, 0, -1);
        }
        return  "";
    }

    public static void main(String[] args) {
        System.out.println(parentBit("x(hello)"));
    }
}
