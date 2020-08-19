package com.avijitsamanta.StringPrograms;

import java.util.Arrays;

/*
Given a word S and a text C.
Return the count of the occurences of anagrams of the word in the text.
Input:
2
forxxorfxdofr
for
aabaabaa
aaba

Output:
3
4
 */
public class CountOccurencesOfAnagrams {

    private static void count(String str, String txt) {
        int len = txt.length();
        char[] t = txt.toCharArray();
        Arrays.sort(t);
        txt = String.valueOf(t);
        int c = 0;
        for (int i = 0; i <= str.length() - len; i++) {
            String key = str.substring(i, i + len);
            char[] ar = key.toCharArray();
            Arrays.sort(ar);
            key = String.valueOf(ar);

            if(key.equals(txt))
                c++;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        count("forxxorfxdofr", "orf");
    }
}
