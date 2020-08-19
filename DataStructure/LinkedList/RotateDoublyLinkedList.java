package com.avijitsamanta.DataStructure.LinkedList;

/*
Input:
1
6 2
1 2 3 4 5 6

Output:
3 4 5 6 1 2
 */
public class RotateDoublyLinkedList {
    static class Node {
        int data;
        Node prev, next;

        public Node(int d) {
            this.data = d;
            prev = null;
            next = null;
        }
    }

    private static Node node;

    private static Node rotateP(Node head, int p) {
        Node myNode, headNode = head;
        int c = 0;
        while (headNode != null) {
            c++;

        }
        return null;
    }

    private static void add(int val) {
        Node cur = new Node(val);
        cur.next = node;
        node = cur;
        node.prev = cur;
    }

    private static void display() {
        Node head = node;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        add(6);
        add(5);
        add(4);
        add(3);
        add(2);
        add(1);
        display();
    }
}
