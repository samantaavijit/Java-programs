package com.avijitsamanta.DS_ALGO;

import java.util.Scanner;
/*
https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 */
public class ArrayReverse {
    private static String reverse(char[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char a = arr[i];
            arr[i] = arr[j];
            arr[j] = a;
            i++;
            j--;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(reverse(sc.next().toCharArray()));
        }
    }
}
