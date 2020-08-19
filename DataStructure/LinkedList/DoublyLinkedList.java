package com.avijitsamanta.DataStructure.LinkedList;

public class DoublyLinkedList {
    static class ListNode {
        ListNode next, prev;
        int val;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // Insert Into Doubly Linked List
    private static ListNode insert(ListNode head, int val) {
        if (head == null)
            return new ListNode(val);

        ListNode node = insert(head.next, val);
        head.next = node;
        node.prev = head;
        return head;
    }

    // Insert Into Doubly Linked List (SORTED)
    private static ListNode sortedInsert(ListNode head, int val) {
        ListNode cur = new ListNode(val);
        if (head == null)
            return cur;
        if (val <= head.val) {
            cur.next = head;
            head.prev = cur;
            return cur;
        }

        ListNode node = sortedInsert(head.next, val);
        head.next = node;
        node.prev = head;
        return head;
    }

    private static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static ListNode reverseLinkedList(ListNode head) {
        ListNode cur = head, pNode = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next=pNode;
            cur.prev=temp;
            pNode=cur;
            cur=temp;
        }
        return pNode;
    }

    private static ListNode reverseUsingRecursion(ListNode head){
        ListNode temp = head.next;
        head.next = head.prev;
        head.prev = temp;
        return temp == null ? head : reverseLinkedList(temp);
    }

    private static void revDisplay(ListNode head) {
        while (head.next != null)
            head = head.next;

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head;
        head = insert(null, 1);
        head = insert(head, 3);
        head = insert(head, 4);
        head = insert(head, 5);
        head = insert(head, 6);
        head = insert(head, 10);
        display(head);
        revDisplay(head);
        ListNode sortHead;
        sortHead = sortedInsert(null, 2);
        sortHead = sortedInsert(sortHead, 10);
        sortHead = sortedInsert(sortHead, 1);
        display(sortHead);
        //revDisplay(sortHead);
        sortHead=reverseLinkedList(sortHead);
        display(sortHead);
        revDisplay(sortHead);
    }
}
