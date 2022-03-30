package com.ciftci.hackerrank.scrapbook;

public class Scrapbook {

    public static void main(String[] args) {
        boolean result = extracted(2332);
    }

    private static boolean extracted(int number) {
        String s = String.valueOf(number);
        int numberLength = s.length();

        for (int i = 0; i < numberLength / 2; i++) {
            char firstCharacter = s.charAt(i);
            char secondCharacter = s.charAt(numberLength - (i + 1));
            if (firstCharacter != secondCharacter)
                return false;
        }
        return true;
    }
}
