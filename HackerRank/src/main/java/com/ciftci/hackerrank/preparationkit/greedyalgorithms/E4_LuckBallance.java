package com.ciftci.hackerrank.preparationkit.greedyalgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E4_LuckBallance {

    public static void main(String[] args) {

        List<Integer> integer1 = Arrays.asList(5, 1);
        List<Integer> integer2 = Arrays.asList(4, 0);
        List<Integer> integer3 = Arrays.asList(6, 1);
        List<Integer> integer4 = Arrays.asList(2, 1);
        List<Integer> integer5 = Arrays.asList(8, 0);

        List<List<Integer>> input = new ArrayList<>();
        input.add(integer1);
        input.add(integer2);
        input.add(integer3);
        input.add(integer4);
        input.add(integer5);

        int result = luckBalance(2, input);

        System.out.println(result);
    }

    public static int luckBalance(int k, List<List<Integer>> contests) {


        List<Integer> importantContests = new ArrayList<>();

        int sumLuscPoint = 0;
        for ( List<Integer> contest : contests){
            Integer value = contest.get(0);
            Integer importance = contest.get(1);

            if(importance == 0){
                sumLuscPoint += value;
                continue;
            }

            importantContests.add(value);
        }

        importantContests.sort( Integer::compareTo);

        for (int i = 0; i<importantContests.size(); i++){
            if(i < importantContests.size() - k){
                sumLuscPoint -= importantContests.get(i);
                continue;
            }
            sumLuscPoint += importantContests.get(i);

        }


        return sumLuscPoint;
    }
}
