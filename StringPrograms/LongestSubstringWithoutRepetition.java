package com.avijitsamanta.StringPrograms;

import java.util.HashSet;

public class LongestSubstringWithoutRepetition {

    private static String check(String str) {
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, max = 0;
        StringBuilder s = new StringBuilder();

        while (j < str.length()) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                j++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(str.charAt(i));
                i++;
            }
        }
        for (char c:set)
            s.append(c);

        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(check("geeksforgeeks"));
        System.out.println(check("ABDEFGABEF"));
        System.out.println(check("GWzcxWGAkzQwtRV"));
        System.out.println(check("aab"));
        System.out.println(check("dvdf"));

    }
}
