package com.ciftci.leetcode.datastructures1;

import java.util.HashMap;
import java.util.Map;

public class E9_36_ValidSudoke {

    public static void main(String[] args) {

    }

    public boolean isValidSudoku(char[][] board) {

        Map<Character, Integer> frequencyMap = new HashMap<>();
        int boardLenth = 9;
        for (int i = 0 ; i< boardLenth ; i++ ) {
            for (int j = 0; j < boardLenth; j++) {
                char currentCharacter = board[i][j];

                if(frequencyMap.containsKey(currentCharacter)){
                    return false;
                }
                frequencyMap.put(currentCharacter,1);
            }
        }
        frequencyMap.clear();

        for (int i = 0 ; i< boardLenth ; i++ ) {
            for (int j = 0; j < boardLenth; j++) {
                char currentCharacter = board[j][i];

                if(frequencyMap.containsKey(currentCharacter)){
                    return false;
                }
                frequencyMap.put(currentCharacter,1);
            }
        }
        frequencyMap.clear();

        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 3 ; j++) {

                for (int i1 = 0; i1 < 3; i1++) {
                    for (int j1 = 0; j1 < 3; j1++) {
                        char currentCharacter = board[(i * 3) + i1 ][ (j * 3) + j1 ];

                        if(frequencyMap.containsKey(currentCharacter)){
                            return false;
                        }
                        frequencyMap.put(currentCharacter,1);
                    }
                }
            }
        }

        return true;
    }
}
