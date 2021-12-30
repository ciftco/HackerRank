package com.ciftci.hackerrank.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E1_2DArrayDS {

    public static void main(String[] args) {

        List<Integer> list0 = new ArrayList(Arrays.asList( -9 ,-9 ,-9 , 1, 1, 1 ));
        List<Integer> list1 = new ArrayList(Arrays.asList(  0, -9,  0,  4, 3, 2 ));
        List<Integer> list2 = new ArrayList(Arrays.asList( -9 ,-9 ,-9 , 1 ,2, 3));
        List<Integer> list3 = new ArrayList(Arrays.asList(  0  ,0  ,8 , 6,6 ,0));
        List<Integer> list4 = new ArrayList(Arrays.asList(  0 , 0,  0 ,-2 ,0 ,0));
        List<Integer> list5 = new ArrayList(Arrays.asList(  0 , 0 , 1 , 2, 4 ,0));

        List<List<Integer>> array = new ArrayList<>();
        array.add(list0);
        array.add(list1);
        array.add(list2);
        array.add(list3);
        array.add(list4);
        array.add(list5);

        int max =  hourglassSum(array);

    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int maxValue = Integer.MIN_VALUE;
        for(int i  = 0; i < arr.size() -2; i++){
            for (int j = 0; j < arr.get(0).size() - 2 ; j++){
                int sum = sumValues(i, j , arr);

                if(sum > maxValue){
                    maxValue = sum;
                }
            }
        }

        return maxValue;
    }

    private static int sumValues(int i, int j ,List<List<Integer>> arr){
        List<Integer> firstRow = arr.get(i);
        List<Integer> secondRow = arr.get(i + 1);
        List<Integer> thirdRow = arr.get(i + 2);
        int sumFirstRow = firstRow.get(j) + firstRow.get(j + 1) + firstRow.get(j + 2);
        int sumSecondRow = secondRow.get(j +1);
        int sumThirdRow = thirdRow.get(j) + thirdRow.get(j + 1) + thirdRow.get(j + 2);

        int result = sumFirstRow + sumSecondRow + sumThirdRow;
        return result ;
    }


}
