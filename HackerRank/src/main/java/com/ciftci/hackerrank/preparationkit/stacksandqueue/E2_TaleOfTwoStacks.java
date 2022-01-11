package com.ciftci.hackerrank.preparationkit.stacksandqueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class E2_TaleOfTwoStacks {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }




}

class  MyQueue<T>{

    Queue<T> queue = new ArrayDeque<>();

    public void enqueue(T nextInt) {
        queue.add(nextInt);
    }

    public T dequeue() {
        return queue.poll();
    }

    public T peek() {
        T peek = queue.peek();
        return peek;

    }
}

