package com.avijitsamanta.Collage;

import java.util.LinkedList;

class MyStack<E> {
    private final LinkedList<E> list = new LinkedList<>();
    private int pos = -1;

    public void push(E val) {
        list.add(val);
        pos++;
    }

    public E peek() throws Exception {
        if (pos == -1) throw new Exception("Stack is empty");
        return list.get(pos);
    }

    public E pop() throws Exception {
        if (pos == -1) throw new Exception("Stack is empty");
        E val = list.get(pos);
        list.remove(pos);
        pos--;
        return val;
    }
}

public class StackUsingLinkedList {


    public static void main(String[] args) throws Exception {
        MyStack<Integer> stack = new MyStack<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("PUSH " + i);
            stack.push(i);
        }

        System.out.println("PEEK " + stack.peek());
        System.out.println("POP " + stack.pop());
        System.out.println("PEEK " + stack.peek());

    }
}
