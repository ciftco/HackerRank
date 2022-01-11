package com.ciftci.leetcode.datastructures1;

public class E10_74_Search2dMatrix {

    public static void main(String[] args) {

    }



    public boolean searchMatrix(int[][] matrix, int target) {

        int rowCount = matrix.length;
        int columnCount = matrix[0].length;

        int rowNumberToSearch = -1;
        for (int i = 0; i< rowCount; i++){
            int headValue = matrix[i][0];
            if(headValue == target){
                return true;
            }

            if(headValue > target){
                rowNumberToSearch = i > 0 ? i-1 : 0;
                break;
            }
        }

        if(rowNumberToSearch == -1){
            rowNumberToSearch = rowCount -1;
        }

        for (int i = 0; i < columnCount; i++ ){

            int currnetValue = matrix[rowNumberToSearch][i];
            if(currnetValue == target) {
                return true;
            }
        }

        return false;
    }


}
