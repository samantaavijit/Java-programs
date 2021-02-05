package com.avijitsamanta.Collage;

import java.util.LinkedList;

class MyQueue<E> {
    private final LinkedList<E> list = new LinkedList<>();
    private int frontEnd, rearEnd;

    public MyQueue() {
        this.frontEnd = this.rearEnd = 0;
    }

    public void add(E val) {
        list.add(rearEnd++, val);
    }

    public E peek() throws Exception {
        if (frontEnd == 0 && rearEnd == 0) throw new Exception("Queue is empty");
        return list.get(frontEnd);
    }

    public E remove() throws Exception {
        if (frontEnd == 0 && rearEnd == 0) throw new Exception("Queue is empty");
        E val = list.get(frontEnd);
        frontEnd++;
        if (frontEnd == rearEnd) frontEnd = rearEnd = 0; // End of the queue
        return val;
    }

    public void show() {
        for (int i = frontEnd; i < rearEnd; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

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
