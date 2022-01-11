package com.ciftci.leetcode.algorithm1;

public class E2_278_First_Bad_Version {


    public static void main(String[] args) {

        int result  = firstBadVersion(15500);

        System.out.println(result);
    }


    public static int firstBadVersion(int n) {

        int start = 1;
        int end = n;

        int mid = 0;

        int loopCount = 0;
        while(start < end){
            mid =( start + end ) / 2;
            if(isBadVersion(mid)){
                end = mid;
            }else {
                start = mid+1;
            }

            loopCount++;
        }

        System.out.println(loopCount);
        return start;

    }

    private static boolean isBadVersion(int middlle){
        return middlle > 15499;
    }


}
