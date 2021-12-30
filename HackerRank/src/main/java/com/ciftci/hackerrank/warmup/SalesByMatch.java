package com.ciftci.hackerrank.warmup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch {

    //https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(10);
        list.add(20);
        int numberOfPairs = sockMerchant(9,list);
        System.out.println(numberOfPairs);


    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Set<Integer> oddPairs = new HashSet<Integer>();
        int numberOfPairs = 0;
        for (int i = 0 ; i< n ; i++){
            Integer item = ar.get(i);
            if(oddPairs.contains(item)){
                oddPairs.remove(item);
                numberOfPairs++;
                continue;
            }
            oddPairs.add(item);
        }
        return numberOfPairs;

    }

}
