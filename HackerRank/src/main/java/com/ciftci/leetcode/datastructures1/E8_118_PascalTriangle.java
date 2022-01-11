package com.ciftci.leetcode.datastructures1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E8_118_PascalTriangle {

    public static void main(String[] args) {
        List<List<Integer>> generate = generate(5);


    }


    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>>  result = new ArrayList<>();

        for (int i = 0; i<numRows;i++){
            result.add(new ArrayList<>());
        }
        for (int i = 0 ; i<numRows; i++){

            for (int j = 0; j<=i ; j++){
                if(j == 0 || j == i)
                {
                    result.get(i).add(1);
                    continue;
                }

                int value = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                result.get(i).add( value);
            }
        }
        return result;

    }

    public static List<List<Integer>> generate1(int numRows) {

        List<List<Integer>>  result = new ArrayList<>();

        for(int i = 1 ; i < numRows + 1 ; i++ ){

            List<Integer> previourRow = i > 1  ?  result.get( i -2) : null;
            List<Integer> row  = createRow( i ,previourRow );
            result.add(row);

        }
        return result;

    }

    private static List<Integer> createRow(int level, List<Integer> previourRow) {
        if(level == 1){
            return Arrays.asList(1);
        }

        if(level == 2){
            return Arrays.asList(1, 1);
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 1 ; i< level + 1 ; i++){
            if(i==1 || i == level){
                result.add(1);
                continue;
            }

            int value = previourRow.get(i - 2) + previourRow.get(i-1);
            result.add(value);
        }
        return result;
    }



}
