package com.ciftci.leetcode.datastructures1;

public class E16_203_RemoveLinkedListElements {

    public static void main(String[] args) {

    }

    public static ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }

        if(head == null){
            return head;
        }

        ListNode pointer  = head.next;
        ListNode previous  = head;

        while (pointer != null){
            if(pointer.val == val) {
                previous.next = pointer.next;
                pointer = pointer.next;
                continue;
            }
            previous = pointer;
            pointer = pointer.next;
        }
        return  head;
    }

    public class ListNode {
         int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


}
