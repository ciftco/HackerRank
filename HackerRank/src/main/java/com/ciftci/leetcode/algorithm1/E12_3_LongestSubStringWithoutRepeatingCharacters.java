package com.ciftci.leetcode.algorithm1;

import java.util.HashMap;
import java.util.Map;

public class E12_3_LongestSubStringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        int result = lengthOfLongestSubstring("abcabcbb");


    }

    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> characerFrequency = new HashMap<>();
        char[] chars = s.toCharArray();

        int longestString = 0;
        int charracterCount = 0;
        for (int i = 0; i < s.length(); i++ ){

            char character = chars[i];
            if(characerFrequency.containsKey(character)){
                charracterCount = 0;
                Integer index  = characerFrequency.get(character);
                i = index;
                characerFrequency.clear();
                continue;
            }

            if(!characerFrequency.containsKey(character)){
                characerFrequency.put(character, i);
                charracterCount++;

                if(charracterCount > longestString){
                    longestString = charracterCount;
                }
            }
        }

        return longestString;
    }


}
