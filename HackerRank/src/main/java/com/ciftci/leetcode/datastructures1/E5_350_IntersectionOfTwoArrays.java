package com.ciftci.leetcode.datastructures1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E5_350_IntersectionOfTwoArrays {


    public static void main(String[] args) {

    }


    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> resultList = new ArrayList<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i< nums1.length ; i++){
            int currentValue = nums1[i];
            frequency.put( currentValue , frequency.getOrDefault(currentValue, 0) + 1 );
        }

        for (Integer currentNumber : nums2 ) {
            if(frequency.containsKey(currentNumber) && frequency.get(currentNumber) > 0 ){
                frequency.put(currentNumber, frequency.get(currentNumber) - 1);
                resultList.add(currentNumber);
            }
        }

        int[] result = new int[resultList.size()];
        int i = 0;
         for (Integer item : resultList){
            result[i] = item;
            i++;
        }
       return result;

    }

}
