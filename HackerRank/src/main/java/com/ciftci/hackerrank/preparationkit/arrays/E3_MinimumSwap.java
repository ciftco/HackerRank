package com.ciftci.hackerrank.preparationkit.arrays;

public class E3_MinimumSwap {

    public static void main(String[] args) {

        int[] array = new int[]{7, 1, 3, 2, 4, 5, 6};
        int i = minimumSwaps(array);
    }

    static int minimumSwaps(int[] a) {

        int swap = 0;
        int arrayLength = a.length;

        for ( int index = 0 ; index < arrayLength ; index++ ) {
            int indexValue = a[index];
            if(indexValue == index + 1) {
                continue;
            }

            int pointer = index;
            for (; pointer < arrayLength ; pointer++){
                int pointerValue = a[pointer];
                if(pointerValue == index + 1){
                    break;
                }
            }

            int temp = a[pointer];
            a[pointer] = a[index];
            a[index] = temp;
            swap++;

        }
        return swap;
    }


}
