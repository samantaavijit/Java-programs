package com.avijitsamanta.StringPrograms;

/*
Given a string check if it is Pangram or not.
A pangram is a sentence containing every letter in the English Alphabet.

Input:
Bawds jog, flick quartz, vex nymph
sdfs
Output:
1
0
 */
public class PangramChecking {
    public static boolean checkPanagram(String s) {
        boolean[] arr = new boolean[26];

        for (char c : s.toCharArray()) {
            if ('A' <= c && c <= 'Z') // FOR A-Z
                arr[c - 'A'] = true;
            else if ('a' <= c && c <= 'z') // FOR a-z
                arr[c - 'a'] = true;
        }
        for (boolean bol : arr)
            if (!bol)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPanagram("The quick brown fox jumps over the lazy dog"));
        System.out.println(checkPanagram("Avijit Samanta"));
    }
}
