package com.avijitsamanta.Collage;

public class QueueUsingLinkedList {
    public static void main(String[] args) throws Exception {
        MyQueue<Integer> queue = new MyQueue<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("ADD " + i);
            queue.add(i);
        }
        queue.show();

        System.out.println("PEEK " + queue.peek());
        System.out.println("REMOVE " + queue.remove());
        queue.show();
        System.out.println("PEEK " + queue.peek());
    }
}
