package com.ciftci.hackerrank.preparationkit.greedyalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E3_MAx_Min {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100, 200, 300, 350,400,401,402);
        int result = maxMin(3, list);

    }

    public static int maxMin(int k, List<Integer> arr) {
        Integer[] integers = arr.toArray(new Integer[0]);
        Arrays.sort(integers);

        int minUnfairness = Integer.MAX_VALUE;
        for (int i = 0; i< integers.length - (k - 1) ; i++){
            int min = integers[i];
            int max = integers[i+ (k -1)];

            int diff =  max-min;
            if(diff<minUnfairness){
                minUnfairness = diff;
            }

            if(minUnfairness == 0){
                break;
            }

        }
        return minUnfairness;

    }



}
