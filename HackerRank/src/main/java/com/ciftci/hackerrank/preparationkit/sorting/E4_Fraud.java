package com.ciftci.hackerrank.preparationkit.sorting;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class E4_Fraud {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 4);
        activityNotifications(integers, 4);

    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        // Write your code her
        Queue<Integer> transactionQueue = new ArrayDeque<>();
        int[] transactions = new int[d];
        int notificationCount = 0;
        int total = 0;
        for (int i = 0; i< expenditure.size(); i++){
            Integer currentTransaction = expenditure.get(i);
            transactionQueue.add(currentTransaction);

            if(i >= d){
                BigDecimal median = new BigDecimal( total).divide(new BigDecimal( d)) ;
                if( new BigDecimal( currentTransaction).compareTo( median.multiply(new BigDecimal(2))) >= 0){
                    notificationCount++;
                }
                Integer removeElement = transactionQueue.poll();
                total -= removeElement;
            }
            total += expenditure.get(i);

        }
        return notificationCount;

    }


}
