package com.avijitsamanta.AllPatterns;

import java.util.Scanner;

/*
55555
54444
54333
54322
54321
*/

/*
EEEEE
EDDDD
EDCCC
EDCBB
EDCBA
 */
public class NumberPattern3 {
    private static void display(int n) {
        int k;
        for (int i = 1; i <= n; i++) {
            k = n;
            for (int j = 1; j <= n; j++) {
                if (i != 1 && j < i) {
                    System.out.print(k--);
                } else
                    System.out.print(k);
            }
            System.out.println();
        }
    }

    private static void displayChar(int n) {
        int k;
        for (int i = 1; i <= n; i++) {
            k = n;
            for (int j = 1; j <= n; j++) {
                if (i != 1 && j < i) {
                    System.out.print((char) (64 + k--));
                } else
                    System.out.print((char) (64 + k));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = sc.nextInt();
        display(n);
        displayChar(n);
    }
}