package com.ciftci.hackerrank.preparationkit.sorting;

import java.util.List;

public class E1_BubleSort {

    public static void main(String[] args) {

    }

    public static void countSwaps(List<Integer> a) {
        // Write your code here
        int swapCount = 0;

        int size = a.size();
        for (int i = 0; i<size ; i++){
            for (int j = 0 ; j < size-1 ; j++){
                if(a.get(j) > a.get(j + 1)){
                    swap(a, j , j +1);
                    swapCount++;
                }
            }
        }

        System.out.println( String.format("Array is sorted in %d swaps.", swapCount));
        System.out.println( String.format("First Element: %d", a.get(0)));
        System.out.println( String.format("Last Element: %d", a.get(a.size() -1)));
    }

    private static void swap(List<Integer> a, int left, int right) {
        Integer temp = a.get(left);
        a.remove(left);
        a.add(right , temp);
    }
}
