package com.ciftci.hackerrank.preparationkit.stringmanipulation;

public class E1_AlternetingCharacters {

    public static void main(String[] args) {

    }

    public static int alternatingCharacters(String s) {

        char[] chars = s.toCharArray();
        char character = chars[0];
        int removeCharacterCount = 0;
        for (int i = 1; i < chars.length ; i++){
            char currentCharacter = chars[i];
            if(character == currentCharacter){
                removeCharacterCount++;
                continue;
            }

            character = currentCharacter;
        }

        return removeCharacterCount;


    }

}
