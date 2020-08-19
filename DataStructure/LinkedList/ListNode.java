package com.avijitsamanta.DataStructure.LinkedList;

public class ListNode {
    public ListNode next, prev;
    public int val;
    public String data;

    private ListNode(int data) {
        this.val = data;
    }

    private ListNode(String val) {
        this.data = val;
    }

    public static ListNode insert(ListNode head, int val) {
        if (head == null)
            return new ListNode(val);
        if (head.next == null)
            head.next = new ListNode(val);
        else
            insert(head.next, val);
        return head;
    }

    public static ListNode insert(ListNode head, String val) {
        if (head == null)
            return new ListNode(val);
        if (head.next == null)
            head.next = new ListNode(val);
        else
            insert(head.next, val);
        return head;
    }

    public static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
