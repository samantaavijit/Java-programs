package com.avijitsamanta.StringPrograms;

import java.util.Scanner;

public class Palindrome {
    // REVERSE A STRING
    private static String rev(String str) {
        String res = "";
        for (char c : str.toCharArray())
            res = c + res;
        return res;
    }

    private static boolean isPalindrome(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String string = sc.next();
        System.out.print(isPalindrome(string, rev(string)));
    }
}
