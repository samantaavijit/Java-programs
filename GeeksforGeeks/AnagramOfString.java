package com.avijitsamanta.GeeksforGeeks;

import java.util.Arrays;
import java.util.HashMap;

/*
Given two strings S1 and S2 in lowercase, the task is to make them anagram.
 The only allowed operation is to remove a character from any string.
 Find the minimum number of characters to be deleted to make both the strings anagram.
 Two strings are called anagram of each other
if one of them can be converted into another by rearranging its letters.
Input:
bcadeh
hea
cddgk
gcd
Output:
3
2
 */
public class AnagramOfString {
    private static int remAnagrams(String s, String s1) {
        int count = 0;
        int[] a = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int pos = s.charAt(i) - 'a';
            a[pos]++;
        }
        for (int i = 0; i < s1.length(); i++) {
            int pos = s1.charAt(i) - 'a';
            a[pos]--;
        }
        for(int i=0;i<26;i++){
            if(a[i]<0)
                a[i]*=-1;
            count+=a[i];
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        String s = "basgadhbfgvhads";
        String s1 = "sjdhgvbjdsbhvbvd";
        remAnagrams(s, s1);
    }
}
