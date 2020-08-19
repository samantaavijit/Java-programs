package com.avijitsamanta.StringPrograms;

import java.util.Stack;

public class BalancedBrackets {
    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if (!stack.isEmpty() && ((stack.peek() == '(' && c == ')') || (stack.peek() == '{' && c == '}')
                    || (stack.peek() == '[' && c == ']')))
                stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[]}";

        System.out.println(isBalanced(str));

    }
}
