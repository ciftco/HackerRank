package com.ciftci.leetcode.datastructures1;

import java.util.HashMap;
import java.util.Map;

public class E14_141_LinkedListCycle {

    public static void main(String[] args) {


    }

    public boolean hasCycle(ListNode head) {

        Map<ListNode, Integer> mapIndexes = new HashMap<>();
        ListNode currnetNode  = head;
        int index = 0;
        while(currnetNode != null ){
            if(mapIndexes.containsKey(currnetNode)){
                return true;
            }
            mapIndexes.put(currnetNode, index);
            index++;
            currnetNode = currnetNode.next;
        }

        return false;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}



