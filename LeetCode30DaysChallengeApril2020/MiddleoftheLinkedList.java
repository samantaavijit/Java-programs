package com.avijitsamanta.LeetCode30DaysChallengeApril2020;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MiddleoftheLinkedList {

    private Node middleNode(Node head) {
        Node tortoise = head, here = head;

        while (here != null && here.next != null) {
            here = here.next.next;
            tortoise = tortoise.next;
        }

        return tortoise;
    }

    public static void main(String[] args) {

    }
}