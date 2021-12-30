package com.ciftci.hackerrank.warmup;

import java.math.BigInteger;

public class RepeatedString {

    //  https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
    public static void main(String[] args) {

        String exapmle = "a";
        long l = repeatedString(exapmle, 1000000000000L);
        System.out.println(l);
    }

    public static long repeatedString(String s, long n) {
        int lengthString = s.length();
        Long repeatCountLong =  n / lengthString;

        Long charcterCounttoTakeFromStart  = n  - (repeatCountLong * lengthString);

        long countInString = s.chars().filter(ch -> ch == 'a').count();
        long result =  countInString * repeatCountLong;

        if(charcterCounttoTakeFromStart != 0){
            String substring = s.substring(0, charcterCounttoTakeFromStart.intValue());
            long count = substring.chars().filter(ch -> ch == 'a').count();
            result += count;
        }

        return result;

    }
}
