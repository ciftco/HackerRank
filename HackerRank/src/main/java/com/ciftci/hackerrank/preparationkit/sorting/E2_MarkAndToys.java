package com.ciftci.hackerrank.preparationkit.sorting;

import java.util.Arrays;
import java.util.List;

public class E2_MarkAndToys {

    //https://www.hackerrank.com/challenges/mark-and-toys/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting&h_r=next-challenge&h_v=zen

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 12, 5, 111, 200, 1000, 10);
        maximumToys(integers, 50);
    }

    public static int maximumToys(List<Integer> prices, int k) {
        prices.sort(Integer::compareTo);

        int total = 0;
        int numberOfToys = 0;
        for (Integer price : prices){
            if( total + price > k){
                break;
            }
            total += price;
            numberOfToys++;
        }

        return numberOfToys;
    }
}
