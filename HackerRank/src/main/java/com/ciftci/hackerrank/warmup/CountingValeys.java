package com.ciftci.hackerrank.warmup;

public class CountingValeys {

    //https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
    public static void main(String[] args) {
        String setpString = "UDDDUDUU";
        countingValleys(8, setpString);
    }


    public static int countingValleys(int steps, String path) {

        int previousevel = 0;
        int currentLevel = 0;
        int valeyCount = 0;
        for (int index = 0; index < steps; index++) {
            char step = path.charAt(index);

            previousevel = currentLevel;
            if (step == 'U') {
                currentLevel++;
            }

            if (step == 'D') {
                currentLevel--;
            }

            if (currentLevel == -1 && previousevel == 0) {
                valeyCount++;
            }
        }
        return valeyCount;
    }
}
