package com.avijitsamanta.competitiveProgramming.HackerRank;


import java.util.HashMap;
import java.util.Map;

public class JavaAnagrams {

    private static boolean isAnagramV1(String a, String b) {
        if (a == null || b == null || a.equals("") || b.equals(""))
            throw new IllegalArgumentException();
        if (a.length() != b.length())
            return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : a.toCharArray()) {
            if (!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, ((map.get(c)) + 1));
        }
        for (char c : b.toCharArray()) {
            if (!map.containsKey(c))
                return false;
            int frequency = map.get(c);
            if (frequency == 0)
                return false;
            else
                map.put(c, --frequency);
        }
        return true;
    }

    private static boolean isAnagramV2(String a, String b) {
        if (a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] cA = new int[26];
        for (char c : a.toCharArray()) {
            int index = c - 'a';
            cA[index]++;
        }
        for (char c : b.toCharArray()) {
            int index = c - 'a';
            cA[index]--;
        }
        for (int i : cA)
            if (i != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagramV2("anagramm", "marganaa"));
        System.out.println(isAnagramV2("anagram", "margana"));
    }
}
