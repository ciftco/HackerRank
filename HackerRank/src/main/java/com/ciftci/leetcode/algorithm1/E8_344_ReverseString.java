package com.ciftci.leetcode.algorithm1;

public class E8_344_ReverseString {

    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {
        int length = s.length;

        for (int i = 0; i < length / 2 ; i++){
            char temp = s[i];
            s[i] = s[length - (i+1)];
            s[length - (i+1)] = temp;
        }
    }
}
