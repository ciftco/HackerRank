package com.ciftci.leetcode.algorithm1;

public class E4_189_RotateArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }

    public static void rotate(int[] nums, int k) {

        int length = nums.length;
        int[] nums2 = new int[length + k];

        for (int i = 0 ; i < length ; i++){
            nums2[i + k ] = nums[i];
        }

        int index = k -1;
        for (int i = nums2.length - 1 ; index > -1 ; i--){
                nums2[index] = nums2[i];
                index--;
        }

        for (int i = 0 ; i < length; i++){
            nums[i] = nums2[i];
        }

    }
}
