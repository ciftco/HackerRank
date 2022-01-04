package com.ciftci.hackerrank.preparationkit.hashmaps;

import javax.swing.text.Style;
import java.util.*;

public class E1_RansomNote {

    public static void main(String[] args) {

        List<String> magazine = Arrays.asList("two", "times", "three", "is", "not", "four");
        List<String> note = Arrays.asList("two", "times", "two", "is", "four");
        checkMagazine(magazine,note);
    }


    public static void checkMagazine(List<String> magazine, List<String> note) {
        // Write your code here
        Map<String, Integer > magazineMap = new HashMap<String, Integer>();
        Map<String, Integer > ransomMap = new HashMap<String, Integer>();

        for (String word : magazine){
            if(!magazineMap.keySet().contains(word)){
                magazineMap.put(word, 1);
                continue;
            }
            Integer integer = magazineMap.get(word);
            magazineMap.put(word, integer + 1);
        }

        for (String word : note){
            if(!ransomMap.keySet().contains(word)){
                ransomMap.put(word, 1);
                continue;
            }
            Integer integer = ransomMap.get(word);
            ransomMap.put(word, integer + 1);
        }

        for (String word : ransomMap.keySet()){
            if(!magazineMap.containsKey(word)) {
                System.out.println("No");
                return;
            }
            int magazineCount = magazineMap.get(word);
            int noteCount = ransomMap.get(word);
            if(magazineCount < noteCount){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}
