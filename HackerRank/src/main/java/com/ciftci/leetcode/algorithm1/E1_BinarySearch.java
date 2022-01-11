package com.ciftci.leetcode.algorithm1;

public class E1_BinarySearch {


    //https://leetcode.com/problems/binary-search/
    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        search(nums, 2);
    }

    public static  int search(int[] nums, int target) {

        int index=-1;
        int begin=0, end=nums.length-1, middle=(end+begin)/2;
        while(begin<=end){
            if (nums[middle]==target) return middle;
            if (nums[middle]>target){
                end=middle-1; middle=(end+begin)/2;
            }
            if (nums[middle]<target){
                begin=middle+1; middle=(end+begin)/2;
            }
        }
        return index;

    }


}
