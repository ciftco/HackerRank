package com.ciftci.hackerrank.hashmaps;

import java.util.*;

public class E5_FrequencyQueries {

    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList( 1,3) );
        list.add(Arrays.asList(2 ,3));
        list.add(Arrays.asList(3, 2));
        list.add(Arrays.asList(1 ,4));
        list.add(Arrays.asList(1, 5));
        list.add(Arrays.asList(1, 5));
        list.add(Arrays.asList(1, 4));
        list.add(Arrays.asList(3, 2));
        list.add(Arrays.asList(2, 4));
        list.add(Arrays.asList(3, 2));

        List<Integer> result = freqQuery(list);
        int i = 0;


    }

    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> numbers = new HashMap<>();
        Map<Integer, Integer> frequency = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (List<Integer> itemList : queries){
            int operation = itemList.get(0);
            int value = itemList.get(1);

            if(operation == 1){
                Integer occuranceFrequency = numbers.getOrDefault(value, 0);
                numbers.put(value , numbers.getOrDefault(value, 0) + 1);
                frequency.put(occuranceFrequency, frequency.getOrDefault(occuranceFrequency, 0) > 0 ? frequency.getOrDefault(occuranceFrequency, 0)  - 1  : 0);
                frequency.put(occuranceFrequency + 1 , frequency.getOrDefault(occuranceFrequency + 1, 0) +1 );

            }

            if(operation == 2){
                Integer occuranceCount = numbers.getOrDefault(value, 0);
                numbers.put(value , occuranceCount > 0 ? occuranceCount - 1 : 0 );

                frequency.put(occuranceCount, frequency.getOrDefault(occuranceCount, 0) > 0 ? frequency.getOrDefault(occuranceCount, 0)  - 1  : 0);
                if(occuranceCount > 1)
                    frequency.put(occuranceCount -1  , frequency.getOrDefault(occuranceCount - 1 , 0) +1 );

            }

            if(operation == 3){
                Integer frequencyCount =  (frequency.get(value) == null ? 0 : frequency.get(value) ) > 0 ? 1 : 0 ;
                result.add(frequencyCount);
            }
        }

        return result;
    }

}
