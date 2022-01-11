package com.ciftci.leetcode.datastructures1;

import java.util.Stack;

public class E20_232_ImplementQueueWithStacks {


    class MyQueue {

        private Stack<Integer> primaryStack = new Stack<>();
        private Stack<Integer> secondaryStack = new Stack();

        public MyQueue() {

        }

        public void push(int x) {

            while (!primaryStack.isEmpty())
            {
                Integer value = primaryStack.pop();
                secondaryStack.push(value);
            }

            primaryStack.push(x);

            while (!secondaryStack.isEmpty()){
                Integer value = secondaryStack.pop();
                primaryStack.push(value);
            }

        }

        public int pop() {
            Integer pop = primaryStack.pop();
            return pop;

        }

        public int peek() {
            Integer peek = primaryStack.peek();
            return peek;
        }

        public boolean empty() {
            boolean empty = primaryStack.isEmpty();
            return empty;
        }
    }


}
