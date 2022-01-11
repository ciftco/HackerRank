package com.ciftci.hackerrank.preparationkit.search;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class E1_IceCreamParior {

    public static void main(String[] args) {

    }

    public static void whatFlavors(List<Integer> cost, int money) {
        // Write your code here

        Map<Integer, Integer> indexValues = new HashMap<>();
        for (int i = 0; i<cost.size() -1 ;i++){
            Integer value = cost.get(i);

            if(indexValues.containsKey(value)) {

                System.out.println( (indexValues.get(value) + 1) + " " + (i+1) )  ;
            }


            Integer key = money - value;
            indexValues.put(key, i);
        }
    }

}
