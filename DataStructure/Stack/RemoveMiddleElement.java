package com.avijitsamanta.DataStructure.Stack;

import java.util.Stack;

public class RemoveMiddleElement {

    private static void removeMiddleElement(Stack<Integer> stack, int n) {
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            if (i != mid)
                System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        removeMiddleElement(stack, stack.size());
    }
}
