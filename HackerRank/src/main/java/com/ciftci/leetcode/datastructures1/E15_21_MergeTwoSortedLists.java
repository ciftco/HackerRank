package com.ciftci.leetcode.datastructures1;

import javax.management.StandardEmitterMBean;

public class E15_21_MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null && list2 == null )
            return null;

        if(list1 != null && list2 == null ){
            return list1;
        }

        if(list1 == null && list2 != null ){
            return list2;
        }

        ListNode head;
        ListNode pointer ;

        if (list1.val< list2.val){
            head = new ListNode(list1.val);
            pointer = head;
            list1 = list1.next;
        }else{
            head = new ListNode(list2.val);
            pointer = head;
            list2 = list2.next;
        }

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                pointer.next = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                pointer.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            pointer = pointer.next;
        }

        while (list1!=null){
            pointer.next = new ListNode(list1.val);
            list1 = list1.next;
            pointer = pointer.next;
        }

        while (list2!=null){
            pointer.next = new ListNode(list2.val);
            list2 = list2.next;
            pointer = pointer.next;
        }

        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}

