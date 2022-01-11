package com.ciftci.leetcode.algorithm1;

public class E3_35_SearchInsertPositions {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 6};
        searchInsert(arr, 5);
    }

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length ;

        int middle = 0;

        if(nums[0] > target )
            return 0;

        if(nums[end -1] < target )
            return end;

        while(start+1<end){

            middle = (start + end) / 2;
            int num = nums[middle];
            if(num < target) {
                start = middle;
            }

            if(num >= target) {
                end = middle;
            }
        }
        return start +1;
    }
}
