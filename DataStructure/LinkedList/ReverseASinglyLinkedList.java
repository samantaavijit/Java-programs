package com.avijitsamanta.DataStructure.LinkedList;

public class ReverseASinglyLinkedList {
    static class ListNode {
        ListNode next;
        int val;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null, cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    private static ListNode insertANodeInEnd(ListNode node, int val) {
        if (node == null)
            return new ListNode(val);
        if (node.next == null)
            node.next = new ListNode(val);
        else
            insertANodeInEnd(node.next, val);
        return node;
    }
    private static void display(ListNode head) {
        if (head == null)
            return;
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    private static int get(ListNode head, int position) {
        ListNode node = head;
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        int pos = len - position - 1;
        if (head == null)
            return -1;
        for (int i = 0; i < pos; i++) {
            head = head.next;
        }
        return head.val;
    }

    public static void main(String[] args) {
        ListNode head;
        head = insertANodeInEnd(null, 1);
        head = insertANodeInEnd(head, 2);
        head = insertANodeInEnd(head, 3);
        head = insertANodeInEnd(head, 4);
        head = insertANodeInEnd(head, 5);
        head = insertANodeInEnd(head, 6);
        head = insertANodeInEnd(head, 7);
        head = insertANodeInEnd(head, 8);
        head = insertANodeInEnd(head, 9);
        head = insertANodeInEnd(head, 10);
        display(head);

        System.out.println(get(head, 9));

//        head = reverse(head);
//        display(head);
//        head = reverse(head);
//        display(head);
    }
}
