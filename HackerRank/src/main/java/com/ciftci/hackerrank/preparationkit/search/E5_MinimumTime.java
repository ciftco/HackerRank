package com.ciftci.hackerrank.preparationkit.search;

import java.util.Arrays;

public class E5_MinimumTime {

    public static void main(String[] args) {
        long l = 5L;
        long l1 = 2L;
        long l3 = l / l1;

        long[] machines = {2,3};
        minTime( machines, 5);
    }

    static long minTime(long[] machines, long goal) {

        Arrays.sort(machines);
        long fastestMachine = machines[0];
        long slovestMachine = machines[machines.length - 1];

        long maxDay =  goal * fastestMachine ;
        long minDay = 0;

        while(maxDay - minDay > 1){
            long midDays =  (maxDay + minDay ) /2;

            long  sumProducts = 0;
            for (int i = 0; i < machines.length ; i++){
                long machineValue = machines[i];
                long producesProducts = midDays / machineValue;
                sumProducts += producesProducts;
            }

            if(sumProducts < goal){
                minDay = midDays ;
            }else {
                maxDay = midDays ;
            }

        }
        return maxDay;

    }


}
