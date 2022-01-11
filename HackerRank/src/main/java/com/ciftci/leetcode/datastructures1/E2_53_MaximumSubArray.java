package com.ciftci.leetcode.datastructures1;

public class E2_53_MaximumSubArray {

    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {

        int length  = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++){
            for (int j = i+1 ; j< length ; j++) {
                int localSum  = 0;
                for(int start = i; start <= j;start++){
                    localSum += nums[start];
                }
                if(localSum > maxSum)
                    maxSum = localSum;
            }
        }
        return maxSum;
    }


}
