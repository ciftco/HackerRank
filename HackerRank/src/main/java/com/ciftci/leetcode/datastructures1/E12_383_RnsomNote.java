package com.ciftci.leetcode.datastructures1;

import java.util.HashMap;
import java.util.Map;

public class E12_383_RnsomNote {


    public static void main(String[] args) {

        boolean result = canConstruct("a", "b") ;
    }

    public static  boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomeCharacterFrequency = new HashMap<>();
        Map<Character, Integer> magazineCharacterFrequency = new HashMap<>();

        char[] ransomeNoteCharacters = ransomNote.toCharArray();
        char[] magazineNoteCharacters = magazine.toCharArray();

        for (int i = 0; i < ransomeNoteCharacters.length; i++){
            char ransomeNoteCharacter = ransomeNoteCharacters[i];
            ransomeCharacterFrequency.put(ransomeNoteCharacter, ransomeCharacterFrequency.getOrDefault(ransomeNoteCharacter, 0) +1);
        }

        for (int i = 0; i < magazineNoteCharacters.length; i++){
            char currentCharacter = magazineNoteCharacters[i];
            magazineCharacterFrequency.put(currentCharacter, magazineCharacterFrequency.getOrDefault(currentCharacter, 0) +1);
        }

        for (Character character : ransomeCharacterFrequency.keySet()){
            int ransomeNoteCharacterCount = ransomeCharacterFrequency.get(character);

            if(!magazineCharacterFrequency.containsKey(character)) {
                return false;
            }

            int magazineCharacterCount = magazineCharacterFrequency.get(character);

            if(ransomeNoteCharacterCount > magazineCharacterCount){
                return false;
            }
        }

        return true;


    }
}
