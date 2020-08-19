package com.avijitsamanta.DataStructure.LinkedList;

public class PalindromeLinkedList {
    static class ListNode {
        ListNode next;
        int val;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }


    private static ListNode insertNode(ListNode node, int val) {
        if (node == null)
            return new ListNode(val);
        if (node.next == null)
            node.next = new ListNode(val);
        else
            insertNode(node.next, val);
        return node;
    }

    private static void display(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
        System.out.println();
    }

    private static boolean flag = true;

    private static boolean isPalindrome(ListNode head) {
        ListNode p1, p2;
        p1 = p2 = head;
        solve(p1, p2);
        return flag;
    }

    private static ListNode solve(ListNode p1, ListNode p2) {
        if (p1 == null) return p2;
        ListNode node = solve(p1.next, p2);
        if (node.val != p1.val) flag = false;
        return node.next;
    }

    public static void main(String[] args) {
        ListNode head;
        head = insertNode(null, 1);

        head = insertNode(head, 2);
        head = insertNode(head, 1);

        display(head);

        System.out.println(isPalindrome(head));

    }
}
