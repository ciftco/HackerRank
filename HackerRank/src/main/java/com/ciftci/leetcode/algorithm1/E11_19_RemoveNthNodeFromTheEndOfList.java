package com.ciftci.leetcode.algorithm1;

public class E11_19_RemoveNthNodeFromTheEndOfList {

    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null ){
            return head;
        }

        ListNode nTHNode = head;
        ListNode pointer = head;
        ListNode nthNodePreviour = head;
        int nodecount = 0;

        while(pointer != null){
            nodecount++;
            if(nodecount > n){
                nthNodePreviour = nTHNode;
                nTHNode = nTHNode.next;
            }
            pointer = pointer.next;
        }

        nthNodePreviour.next = nTHNode.next;

        return head;
    }


      public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
