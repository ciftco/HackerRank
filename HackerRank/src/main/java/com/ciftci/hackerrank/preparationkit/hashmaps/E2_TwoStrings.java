package com.ciftci.hackerrank.preparationkit.hashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class E2_TwoStrings {

    public static void main(String[] args) {

    }


    public static String twoStrings(String s1, String s2) {
        Set<String> word1Set = new HashSet<>();

        for (char character : s1.toCharArray()){
            word1Set.add( String.valueOf(character));
        }

        for (char character : s2.toCharArray()){
            if(word1Set.contains( String.valueOf(character)))
                return "YES";
        }

        return  "NO";
    }


}
