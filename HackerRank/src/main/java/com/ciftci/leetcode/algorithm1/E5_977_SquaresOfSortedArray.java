package com.ciftci.leetcode.algorithm1;

public class E5_977_SquaresOfSortedArray {

    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums) {

        int[] result =  new int[nums.length];
        int head = 0;

        int tail = nums.length -1;

        for (int i = 0; i< nums.length;i++){
            int headValue = nums[head];
            int tailValue = nums[tail];
            int reaultIndex = nums.length - (i +1);
            if(headValue * headValue > tailValue * tailValue){
                result[reaultIndex] = headValue * headValue;
                head++ ;
            }else{
                result[reaultIndex] = tailValue * tailValue;
                tail--;
            }
        }
        return result;
    }

}
