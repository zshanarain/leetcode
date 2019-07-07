package com.codingbat.recursion;

public class ChangeXY {

    private static void updateXToY(char[] charArray, int index) {
        if (index < charArray.length) {
            if(charArray[index] == 'x') {
                charArray[index] = 'y';
            }
            updateXToY(charArray, index+1);
        }
    }

    public static String changeXY(String str) {
        if (str.length() > 0) {
           char[] charArray = str.toCharArray();
           updateXToY(charArray, 0);
           return new String(charArray);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(changeXY("codex"));
        System.out.println(changeXY("xxhixx"));
        System.out.println(changeXY("xhixhix"));
    }
}
