package com.ciftci.leetcode.datastructures1;

import java.util.Arrays;

public class E1_217_ContainsDubticate {

    public static void main(String[] args) {






        }

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int i = 0; i< nums.length -1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }

        return false;
    }

}
