package com.avijitsamanta.DataStructure.Stack;

import java.util.ArrayList;

public class MyStack<T> {
    private final ArrayList<T> arr = new ArrayList<>();

    private int pos = -1;

    public boolean isEmpty() {
        return pos == -1;
    }

    public void push(T val) {
        arr.add(val);
        pos++;
    }

    public T peek() throws Exception {
        if (pos == -1) throw new Exception("MyStack is empty");
        return arr.get(pos);
    }

    public T pop() throws Exception {
        if (pos == -1) throw new Exception("MyStack is empty");
        T val = arr.remove(pos);
        pos--;
        return val;
    }
}
