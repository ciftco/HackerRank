package com.ciftci.hackerrank.warmup;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds {

    //https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
    public static void main(String[] args) {

        List<Integer> list =  new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);

        int stepCount = jumpingOnClouds(list);
        System.out.println(stepCount);
    }


    public static int jumpingOnClouds(List<Integer> c) {

        int listSize = c.size();
        int stepCount = 0;
        for (int i = 0 ; i < listSize-1 ; i++){
            int nextNextCloud = i < listSize -2 ? c.get(i+2) : 1 ;
            if(nextNextCloud == 0){
                i++;
            }

            stepCount++;
        }

        return stepCount;
    }

}
