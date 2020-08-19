package com.avijitsamanta.DataStructure.LinkedList;

public class PalindromeString {
    static class Node {
        String data;
        Node next;

        Node(String key) {
            data = key;
            next = null;
        }
    }

    static Node head;

    private static boolean compute(Node node) {
        StringBuilder str = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        while (node != null) {
            str.append(node.data);
            node = node.next;
        }
        for (int i = 0; i < str.length(); i++) {
            rev.insert(0, str.charAt(i));
        }
        return (str.toString().equals(rev.toString()));
    }

    private static void add(String str) {
        Node node = new Node(str);
        node.next = head;
        head = node;
    }

    public static void main(String[] args) {
//        add("a");
//        add("dcb");
//        add("d");
//        add("bc");
//        add("a");
//        System.out.println(compute(head));

        ListNode head;
        head = ListNode.insert(null, "a");
        head = ListNode.insert(head, "dcb");

    }
}
