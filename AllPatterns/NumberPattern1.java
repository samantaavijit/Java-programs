package com.avijitsamanta.AllPatterns;

import java.util.Scanner;

/*
1
3 2
4 5 6
10 9 8 7
11 12 13 14 15
*/

/*
A
C B
D E F
J I H G
K L M N O
 */
public class NumberPattern1 {
    private static void display(int n) {
        for (int i = 1, k = 0, l; i <= n; i++) {
            k = i % 2 == 0 ? k + i - 1 : k + 1;
            l = k;
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(l-- + " ");
                } else {
                    System.out.print(l++ + " ");
                    k++;
                }
            }
            System.out.println();
        }
    }

    private static void displayChar(int n) {
        for (int i = 1, k = 0, l; i <= n; i++) {
            k = i % 2 == 0 ? k + i - 1 : k + 1;
            l = k;
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (64 + l--) + " ");
                } else {
                    System.out.print((char) (64 + l++) + " ");
                    k++;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n=sc.nextInt();
        display(n);
        displayChar(n);
    }
}