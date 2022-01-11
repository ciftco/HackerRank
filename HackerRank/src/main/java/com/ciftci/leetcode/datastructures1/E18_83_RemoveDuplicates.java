package com.ciftci.leetcode.datastructures1;

public class E18_83_RemoveDuplicates {

    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return head;
        }

        if(head.next == null){
            return head;
        }

        while(head.next != null && head.val == head.next.val){
            head.next = head.next.next;
        }

        ListNode pointer = head;
        while (pointer != null && pointer.next != null){
            if(pointer.val == pointer.next.val){
                pointer.next = pointer.next.next;
                continue;
            }
            pointer = pointer.next;
        }

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
