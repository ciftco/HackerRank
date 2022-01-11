package com.ciftci.leetcode.datastructures1;

import java.util.HashMap;
import java.util.Map;

public class E13_242_ValidAnagram {

    public static void main(String[] args) {

    }


    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
        Map<Character, Integer> firstCharacterFrequency = new HashMap<>();
        Map<Character, Integer> magazineCharacterFrequency = new HashMap<>();

        char[] firstStringCharacters = s.toCharArray();
        char[] secondStringCharacters = t.toCharArray();

        for (int i = 0; i < firstStringCharacters.length; i++){
            char currentCharacter = firstStringCharacters[i];
            firstCharacterFrequency.put(currentCharacter, firstCharacterFrequency.getOrDefault(currentCharacter, 0) +1);
        }

        for (int i = 0; i < secondStringCharacters.length; i++){
            char currentCharacter = secondStringCharacters[i];
            magazineCharacterFrequency.put(currentCharacter, magazineCharacterFrequency.getOrDefault(currentCharacter, 0) +1);
        }

        for (Character character : firstCharacterFrequency.keySet()){
            int firstStringCharacterCount = firstCharacterFrequency.get(character);

            if(!magazineCharacterFrequency.containsKey(character)) {
                return false;
            }

            int secondStringCharacterCount = magazineCharacterFrequency.get(character);

            if(firstStringCharacterCount != secondStringCharacterCount){
                return false;
            }
        }
        return true;
    }


}
