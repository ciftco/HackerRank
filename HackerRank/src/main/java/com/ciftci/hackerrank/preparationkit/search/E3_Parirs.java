package com.ciftci.hackerrank.preparationkit.search;

import java.util.HashMap;
import java.util.List;

public class E3_Parirs {

    public static void main(String[] args) {

    }

    public static int pairs(int k, List<Integer> arr) {
        // Write your code here

        HashMap<Integer , Integer> valuesMap = new HashMap<>();
        int count= 0;

        arr.sort(Integer::compareTo);
        for (Integer item : arr)
        {
            valuesMap.put(item + k, valuesMap.getOrDefault(item + k , 0) + 1);

            if(valuesMap.containsKey(item)){
                valuesMap.get(item);
                count++;
            }
        }

        return count;
    }
}
