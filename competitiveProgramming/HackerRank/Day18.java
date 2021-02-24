package com.avijitsamanta.competitiveProgramming.HackerRank;

import com.avijitsamanta.Collage.MyQueue;
import java.util.Stack;

public class Day18 {
    static class Solution {
        Stack<Character> stack = new Stack<>();
        MyQueue<Character> queue = new MyQueue<>();

        void pushCharacter(char c) {
            stack.push(c);
        }

        void enqueueCharacter(char c) {
            queue.add(c);
        }

        Character popCharacter() {
            return stack.pop();
        }

        Character dequeueCharacter() throws Exception {
            return queue.peek();
        }
    }

    public static void main(String[] args) throws Exception {
        String input = "racecar";
        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
