package com.ciftci.leetcode.datastructures1;

public class E6_121_BestTimeToBuyStocks {

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {

        if(prices==null||prices.length<=1)
            return 0;

        int minimum=prices[0];
        int result=0;

        for(int i=1; i<prices.length; i++){
            result = Math.max(result, prices[i]-minimum);
            minimum = Math.min(minimum, prices[i]);
        }

        return result;
    }
}
