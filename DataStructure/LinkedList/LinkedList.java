package com.avijitsamanta.DataStructure.LinkedList;

import java.util.Scanner;

public class LinkedList {

    static class Node {
        private int data;
        private Node next;

        Node() {
            this.data = 0;
            this.next = null;
        }

        Node(final int val, final Node node) {
            this.data = val;
            this.next = node;
        }

        public void setNext(final Node node) {
            this.next = node;
        }

        public void setData(final int val) {
            this.data = val;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

    private int size;
    private Node start;

    LinkedList() {
        this.size = 0;
        this.start = null;
    }

    public boolean isEmpty() {
        return start != null;
    }

    public void insertAtFirst(final int val) {
        start = new Node(val, start);
        size++;
    }

    public void insertAtLast(final int val) {
        final Node node = new Node();
        node.setData(val);
        if (isEmpty()) {
            Node t = start;
            while (t.getNext() != null)
                t = t.getNext();
            t.setNext(node);
        } else
            start = node;
        size++;
    }

    public void insertAtPosition(final int val, final int position) {
        if (position == 1)
            insertAtFirst(val);
        else if (size + 1 == position)
            insertAtLast(val);
        else if (position - 1 < size && position > 1) {
            final Node node = new Node();
            node.setData(val);
            Node t = start;
            for (int i = 1; i < position - 1; i++) {
                t = t.getNext();
            }
            node.setNext(t.getNext());
            t.setNext(node);
            size++;
        } else
            System.out.println("Position is not valid " + position);
    }

    public void viewList() {
        if (isEmpty()) {
            Node t = start;
            for (int i = 1; i <= size; i++) {
                System.out.print(t.getData() + " ");
                t = t.getNext();
            }
        } else
            System.out.println("List is Empty");
    }

    public int viewList(int index) {
        if (isEmpty()) {
            Node t = start;
            for (int i = 1; i <= size; i++) {
                if (i == index)
                    return t.getData();
                t = t.getNext();
            }
        }
        return -1;
    }

    public void deleteAtFirst() {
        if (isEmpty()) {
            start = start.getNext();
            size--;
        } else
            System.out.println("List is Empty");
    }

    public void deleteAtLast() {
        if (isEmpty()) {
            if (size == 1) {
                start = null;
            } else {
                Node t = start;
                while (t.getNext() != null)
                    t = t.getNext();
                t.setNext(null);
            }
            size--;
        } else
            System.out.println("List is Empty");
    }

    public void deleteAtPosition(int position) {
        if (position == 1)
            deleteAtFirst();
        else if (position == size)
            deleteAtLast();
        else if (position > 1 && position < size) {
            Node t = start, a;
            for (int i = 1; i < position - 1; i++)
                t = t.getNext();
            a = t.getNext();
            t.setNext(a.getNext());
            size--;
        } else
            System.out.println("List is Empty");
    }

    static Node deleteNode(Node head, int position) {
        if (position == 0){ return head.next; }
        head.next = deleteNode(head.next, position-1);
        return head;
    }

    public static void main(final String[] args) {
        final LinkedList list = new LinkedList();

        final Scanner sc = new Scanner(System.in);
        int choice, val, pos;

        do {
            System.out.print("\n1. For Insert at First \n2. For Insert at Last \n3. For Insert at Position"
                    + "\n4. For Delete at First \n5. For Delete at Last \n6. For Delete at Position"
                    + "\n8. For Display \n9. Exit \nEnter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Value ");
                    val = sc.nextInt();
                    list.insertAtFirst(val);
                    break;
                case 2:
                    System.out.print("Enter the Value ");
                    val = sc.nextInt();
                    list.insertAtLast(val);
                    break;
                case 3:
                    System.out.print("Enter the Value ");
                    val = sc.nextInt();
                    System.out.print("Enter the position ");
                    pos = sc.nextInt();
                    list.insertAtPosition(val, pos);
                    break;
                case 4:
                    list.deleteAtFirst();
                    break;
                case 5:
                    list.deleteAtLast();
                    break;
                case 6:
                    System.out.print("Enter the position ");
                    pos = sc.nextInt();
                    list.deleteAtPosition(pos);
                    break;
                case 8:
                    list.viewList();
                    System.out.print("\nEnter the position ");
                    pos = sc.nextInt();
                    System.out.println(list.viewList(pos));
                    break;
            }

        } while (choice != 9);
        sc.close();
    }

}