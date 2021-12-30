package com.ciftci.hackerrank.arrays;

import java.util.*;

public class E4_ArrayManipulation {

    public static void main(String[] args) {

        List list1 = Arrays.asList(1,5,3);
        List list2 = Arrays.asList(4,8,7);
        List list3 = Arrays.asList(6,9,1);

        List<List<Integer>> input =  new ArrayList<>();
        input.add(list1);
        input.add(list2);
        input.add(list3);

        long result = arrayManipulation(10, input);
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {

        int queriesLength = queries.size();
        long[] workingArray = new long[n+1];

        long max = Long.MIN_VALUE;

        for (int index= 0 ; index< queriesLength; index++) {
            List<Integer> currentList = queries.get(index);
            int start = currentList.get(0);
            int end = currentList.get(1);
            int value = currentList.get(2);

            workingArray[start - 1] += Long.valueOf(value) ;
            workingArray[end ] -=  Long.valueOf(value) ;
        }

        for (int index = 0 ; index < n; index ++){
            workingArray[index +1] = workingArray[index] + workingArray[index+1];
        }

        for (int index = 0 ; index < n+1; index ++){
             if(workingArray[index] > max )
                 max = workingArray[index];
        }

        return max;
    }
}
