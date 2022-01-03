package com.ciftci.hackerrank.preparationkit.stringmanipulation;

//https://www.hackerrank.com/challenges/special-palindrome-again/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.Stack;

public class E3_SpecialString {


    public static void main(String[] args) {

        boolean is = isSpeecialString("ababa");

        long count = substrCount( 5,"abcbaba");

        //long count = substrCount( 5,"aaaa");

        int i = 0;

    }

    static long substrCount(int n, String s) {

        int stringLenght = s.length();
        long result = 0L;
        for(int i = 0 ; i < stringLenght; i++){
            for(int j = i+1 ; j < stringLenght +1  ; j++){
                String substring = s.substring(i, j);
                boolean speecialString = isSpeecialString(substring);
                if(speecialString){
                    result += 1L;
                }
            }
        }

        return result;
    }

    private static boolean isSpeecialString(String s) {
        if(s.length() == 1){
            return true;
        }

        int stringLenght = s.length();
        char[] chars = s.toCharArray();
        char firstCharacter = chars[0];
        int halfCharacterCount = stringLenght / 2;
        for (int i = 0; i < halfCharacterCount ; i++){
            if( chars[i] != firstCharacter ){
                return false;
            }

            if( chars[ (stringLenght-1) - i ] != firstCharacter){
                return false;
            }
        }
        return true;
    }
}
