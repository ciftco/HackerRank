package com.ciftci.leetcode.datastructures1;

import java.util.HashMap;
import java.util.Map;

public class E11_387_FirstUniqueCharacter {

    public static void main(String[] args) {
        firstUniqChar("aabb");
    }

    public static int firstUniqChar(String s) {

        char[] chars = s.toCharArray();
        Map<Character, Integer> frequencyNap = new HashMap<>();
        
        for (int i = 0; i < chars.length; i++) {
            char currentCharacter = chars[i];
            if(!frequencyNap.containsKey(currentCharacter)){
                frequencyNap.put(currentCharacter, i);
            }else {
                frequencyNap.put(currentCharacter, -1);
            }

        }
        int minIndex = Integer.MAX_VALUE;
        for (char character : frequencyNap.keySet()){
            Integer index   = frequencyNap.get(character);
            if( index != -1 && index  <  minIndex ){
                minIndex = index;
            }
        }

        return minIndex;
    }
    
}
