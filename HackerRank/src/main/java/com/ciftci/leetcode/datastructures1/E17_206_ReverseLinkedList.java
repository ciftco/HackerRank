package com.ciftci.leetcode.datastructures1;

public class E17_206_ReverseLinkedList {

    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {

        if(head == null)
            return head;

        if(head.next == null){
            return head;
        }


        ListNode nextNode = head.next;
        ListNode current = head;


        ListNode newHead = null;
        ListNode lastNode = new ListNode(current.val);
        while (nextNode != null){
            ListNode newNode = new ListNode( nextNode.val);
            newNode.next = lastNode;
            newHead = newNode;
            lastNode = newNode;
            nextNode = nextNode.next;
        }

        return newHead;


    }

    public class ListNode {
         int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


}
