package com.ciftci.leetcode.datastructures1;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.util.Stack;

public class E19_20_ValidParanthesis {

    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        if(s.length()< 2){
            return false;
        }

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < chars.length; i++){
            char currentCharacter = chars[i];

            if(currentCharacter == '{' || currentCharacter == '[' || currentCharacter == '(' ) {
                stack.push(currentCharacter);
                continue;
            }

            if(currentCharacter == '}' || currentCharacter == ']' || currentCharacter == ')' ) {

                if(stack.isEmpty()){
                    return false;
                }

                Character popedCharacter = stack.pop();
                if(currentCharacter == '}' && popedCharacter != '{' ) {
                    return false;
                }

                if(currentCharacter == ')' && popedCharacter != '(' ) {
                    return false;
                }

                if(currentCharacter == ']' && popedCharacter != '[' ) {
                    return false;
                }
            }else{
                return false;
            }

        }

        if(!stack.isEmpty()){
            return false;
        }

        return true;
    }

}
