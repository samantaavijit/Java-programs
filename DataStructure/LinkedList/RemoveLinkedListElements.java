package com.avijitsamanta.DataStructure.LinkedList;

public class RemoveLinkedListElements {

    static class ListNode {
        ListNode next;
        int val;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private static ListNode insertNode(ListNode head, int val) {
        if (head == null)
            return new ListNode(val);
        if (head.next == null)
            head.next = new ListNode(val);
        else
            insertNode(head.next, val);
        return head;
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

    private static ListNode removeElements(ListNode head, int val) {
        ListNode node = null, cur = head;
        while (cur != null) {
            if (cur.val != val) {
                node = insertNode(node, cur.val);
            }
            cur = cur.next;
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode head ;
        head = insertNode(null, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 3);
        head = insertNode(head, 3);
        head = insertNode(head, 5);
        head = insertNode(head, 5);
        head = insertNode(head, 7);
        head = insertNode(head, 3);
        head = insertNode(head, 9);
        head = insertNode(head, 10);

        display(head);

        head = removeElements(head, 3);
        display(head);
    }


}
