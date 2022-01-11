package com.ciftci.hackerrank.preparationkit.greedyalgorithms;

import java.util.Arrays;
import java.util.List;

public class E1_MinimumAbsoluteDiffrence {

    public static void main(String[] args) {

    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Integer[] objects = arr.toArray(new Integer[0]);
        Arrays.sort(objects);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < objects.length -1 ; i++){
            int abs = Math.abs(objects[i] - objects[i + 1]);

            if(minDiff > abs){
                minDiff = abs;
            }
            if(minDiff == 0){
                break;
            }
        }
        return minDiff;
    }
}
