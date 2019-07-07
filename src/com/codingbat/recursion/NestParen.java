package com.codingbat.recursion;

public class NestParen {

    private static boolean isNestParen(String str, int left, int right) {
        if (left < right) {
            if (str.charAt(left) != '(' || str.charAt(right) != ')') {
                return false;
            }

            return isNestParen(str, left+1, right-1);
        }
        return  true;
    }

    public static boolean nestParen(String str) {
        if (str != null && str.length() > 1) {
            if(str.length() % 2 == 1) return false;
            return isNestParen(str, 0, str.length()-1);
        }
        return  false;
    }

    public static void main(String[] args) {
        System.out.println(nestParen("(())"));
        System.out.println(nestParen("((()))"));
        System.out.println(nestParen("(((x))"));
    }
}
