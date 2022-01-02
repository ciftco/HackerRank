package com.ciftci.hackerrank.hashmaps;

import com.oracle.tools.packager.linux.LinuxDebBundler;

import java.util.*;

public class E3_SherlockAndAnagrams {

    public static void main(String[] args) {

        int abcd = sherlockAndAnagrams("abba");
        System.out.println(abcd);
    }

    public static int sherlockAndAnagrams(String s) {

        List<String> subStrings = new ArrayList<>();
        for (int i = 0;i < s.length();i++){
            for(int j = i+1; j <= s.length(); j++){
                String subString = s.substring(i,j);
                subStrings.add(subString);
            }
        }

        int result = 0;
        for(int index = 0 ; index < subStrings.size() ; index++){
            for (int j = index +1; j < subStrings.size(); j++){
                if(isAnagram(subStrings.get(index) , subStrings.get(j) )){
                    result++;
                }
            }
        }

        return result;
    }

    private static boolean isAnagram(String s, String s1) {
        Map<Character, Integer> firstCharacterCountMap = new HashMap<>();
        Map<Character, Integer> secondCharacterCountMap = new HashMap<>();

        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.

        if( s.length() != s1.length()) {
            return false;
        }

        for (char character : s.toCharArray()){
            if(!firstCharacterCountMap.containsKey(character)){
                firstCharacterCountMap.put(character, 1);
                continue;
            }
            firstCharacterCountMap.put(character, firstCharacterCountMap.get(character) + 1);
        }

        for (char character : s1.toCharArray()){

            if(!firstCharacterCountMap.containsKey(character)){
                return false;
            }

            if(!secondCharacterCountMap.containsKey(character)){
                secondCharacterCountMap.put(character, 1);
                continue;
            }
            secondCharacterCountMap.put(character, secondCharacterCountMap.get(character) + 1);
        }

        for (Character character : firstCharacterCountMap.keySet()){
            if(!secondCharacterCountMap.containsKey(character)){
                return false;
            }
            int integer2 = secondCharacterCountMap.get(character);
            int integer1 = firstCharacterCountMap.get(character);

            if(integer1 != integer2 ){
                return false;
            }
        }
        return true;
    }

}
