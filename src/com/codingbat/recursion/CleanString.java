package com.codingbat.recursion;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class CleanString {

    private static String cleanString(String str, char lastChar) {
       if(str != null && str.length() > 0) {
           if (str.charAt(0) == lastChar) {
               return cleanString(str.substring(1), lastChar);
           }
           return str.substring(0,1).concat(cleanString(str.substring(1), str.charAt(0)));
       }

       return str;
    }

    public static String cleanString(String str) {
        if (str != null && str.length() > 1) {
            return cleanString(str, '\u0000');
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(cleanString("yyzzza"));
    }
}
