package com.avijitsamanta.DataStructure.LinkedList;

public class LinkedListCycle {
    static class ListNode {
        ListNode next;
        int val;

        public ListNode(int val) {
            this.next = null;
            this.val = val;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if (fast == slow)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
