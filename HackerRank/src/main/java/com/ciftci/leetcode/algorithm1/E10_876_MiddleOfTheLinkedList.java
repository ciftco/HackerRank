package com.ciftci.leetcode.algorithm1;

public class E10_876_MiddleOfTheLinkedList {

    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head) {

        if(head == null) {
            return head;
        }
        ListNode pointer = head;
        ListNode middle = head;
        int nodeCount = 0;
        while(pointer != null) {
            nodeCount++;
            if(nodeCount % 2 == 0 ){
                middle = middle.next;
            }
            pointer = pointer.next;
        }

        //if(nodeCount %2 == 0){
          //  middle = middle.next;
        //}

        return middle;
    }

    class ListNode {

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}



}
