package com.ciftci.hackerrank.preparationkit.arrays;

import java.util.Arrays;
import java.util.List;

public class Ex_NewYearChaos {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 1, 5, 3, 4);
        minimumBribes(integers);
    }


    public static void minimumBribes(List<Integer> q) {

        int minBribes = 0;
        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) - 2 > i + 1) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = i - 1; j >= q.get(i) - 2 && j >= 0; j--) {
                if (q.get(j) > q.get(i)) minBribes++;
            }
        }
        System.out.println(minBribes);
    }


}
