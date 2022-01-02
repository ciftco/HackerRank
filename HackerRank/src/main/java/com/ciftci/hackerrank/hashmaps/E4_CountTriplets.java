package com.ciftci.hackerrank.hashmaps;

import java.util.*;
import java.util.stream.Collectors;

public class E4_CountTriplets {

    public static void main(String[] args) {

        List<Long> longs = Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L);
        long l = countTriplets(longs, 0L);
        System.out.println(l);

    }

    static long countTriplets(List<Long> arr, long r) {

        Map<Long, Long> rightMap = new HashMap<>();
        Map<Long, Long> leftMap = new HashMap<>();

        for (Long item : arr){
            rightMap.put(item,  rightMap.getOrDefault(item, 0L));
        }

        long count = 0;
        for (Long middleValue : arr){
            long count1 = 0, count3 = 0;
            rightMap.put(middleValue , rightMap.getOrDefault(middleValue, 0L) - 1L);

            if( middleValue % r == 0 && leftMap.containsKey(middleValue / r) ){
                count1 = leftMap.get(middleValue / r);
            }


            if( rightMap.containsKey(middleValue * r) ){
                count3 = rightMap.get(middleValue * r);
            }

            count += count1 * count3;

            leftMap.put(middleValue, leftMap.getOrDefault(middleValue, 0L) +1L);

        }

        return count;

    }


}
