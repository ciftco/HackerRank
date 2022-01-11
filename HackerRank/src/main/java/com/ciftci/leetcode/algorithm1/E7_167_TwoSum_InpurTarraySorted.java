package com.ciftci.leetcode.algorithm1;

import java.util.HashMap;
import java.util.Map;

public class E7_167_TwoSum_InpurTarraySorted {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> indexMap = new HashMap<>();

        int arrayLenght = numbers.length;

        for (int i = 0; i < arrayLenght; i++ ){
            int currentValue = numbers[i];

            if(indexMap.containsKey(currentValue)){
                int firstIndex = indexMap.get(currentValue);
                int[] result = new int[]{firstIndex, i +1 };
                return  result;
            }

            indexMap.put(target - currentValue, i + 1);

        }
        return null;
    }

}
