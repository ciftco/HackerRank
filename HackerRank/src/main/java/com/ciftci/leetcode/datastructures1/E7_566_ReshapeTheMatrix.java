package com.ciftci.leetcode.datastructures1;

public class E7_566_ReshapeTheMatrix {

    public static void main(String[] args) {

    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int n = mat.length;
        int m = mat[0].length;
        if (r*c != n*m){
            return mat;
        }

        int[][] res = new int[r][c];
        for (int i=0;i<r*c;i++)
            res[i/c][i%c] = mat[i/m][i%m];

        return res;
    }

}
