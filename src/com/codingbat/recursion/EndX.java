package com.codingbat.recursion;

public class EndX {

    private static void endX(char[] charArray, int left, int right) {
        if (right < charArray.length) {
            if(charArray[left] != 'x') {
                endX(charArray,left+1, right+1);
            } else if (charArray[right] == 'x') {
                endX(charArray, left, right+1);
            } else {
                charArray[left] = charArray[right];
                charArray[right] = 'x';
                endX(charArray, left+1, right+1);
            }
        }
    }

    public static String endX(String str) {
        if (str != null && str.length() > 1) {
            int left = 0, right = 1;
            char[] charArray = str.toCharArray();
            endX(charArray, left, right);

            return new String(charArray);
        }
        return  str;
    }

    public static void main(String[] args) {
        System.out.println(endX("xxre"));
        System.out.println(endX("xxhixx"));
        System.out.println(endX("xhixhix"));
        System.out.println(endX("xxhxi"));
    }
}
