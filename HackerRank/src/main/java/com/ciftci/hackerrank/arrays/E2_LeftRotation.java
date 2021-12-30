package com.ciftci.hackerrank.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E2_LeftRotation {

    // https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays&h_r=next-challenge&h_v=zen
    public static void main(String[] args) {
        List<Integer> array =  new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> result = rotLeft(array, 4);
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {

        for (int i = 0 ; i < d ; i++){
            Integer firstNumber = a.get(0);
            a.remove(0);
            a.add(firstNumber);
        }

        return a;
    }
}
