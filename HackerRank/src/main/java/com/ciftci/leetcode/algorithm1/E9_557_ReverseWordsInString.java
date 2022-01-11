package com.ciftci.leetcode.algorithm1;

public class E9_557_ReverseWordsInString {

    public static void main(String[] args) {

        String input = "Let's take LeetCode contest";
        String result = reverseWords(input);
        System.out.println(result);

    }

    public static String reverseWords(String s) {
        int sentenceLength = s.length();
        char[] sentenceChars = s.toCharArray();

        int wordStart = 0;
        int wordEnd = 0;
        for (int i = 0; i < sentenceLength; i++){
            char currentCharacter = sentenceChars[i];

            if(currentCharacter == ' ' || i == sentenceLength -1){
                wordEnd = currentCharacter == ' ' ?  i -1 : i ;
                for (int j = 0 ; j < ( (wordEnd - wordStart) + 1 ) / 2 ; j++){
                    char temp = sentenceChars[wordStart + j];
                    sentenceChars[wordStart + j] = sentenceChars[ wordEnd - j];
                    sentenceChars[ wordEnd - j] = temp;
                }
                wordStart = i+1;
            }
        }

        String result = new String(sentenceChars);
        return result;
    }
}
