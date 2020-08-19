package com.avijitsamanta.DataStructure.LinkedList;

/*
Given a singly linked list, group all odd nodes together followed by the even nodes.
Please note here we are talking about the node number and not the value in the nodes.
 */
public class OddEvenLinkedList {
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
    /*
    O(1) Extra apace and O(n) Time complexity
     */
    private static ListNode oddEvenListAnotherApproach(ListNode head){
        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    /*
    O(n) Extra apace and O(n) Time complexity
     */
    public static ListNode oddEvenList(ListNode head) {
        ListNode even = head, odd = head.next, myNode = null;
        while (even != null && even.next != null) {
            myNode = insertNode(myNode, even.val);
            even = even.next.next;
        }
        if (even != null)
            myNode = insertNode(myNode, even.val);
        while (odd != null && odd.next != null) {
            myNode = insertNode(myNode, odd.val);
            odd = odd.next.next;
        }
        if (odd != null)
            myNode = insertNode(myNode, odd.val);
        return myNode;
    }

    private static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head;
        head = insertNode(null, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 3);
        head = insertNode(head, 4);
        head = insertNode(head, 5);

        display(head);

        display(oddEvenList(head));
        display(oddEvenListAnotherApproach(head));
    }
}
