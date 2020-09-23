package com.avijitsamanta.AllPatterns;

import java.util.Scanner;

/*
1 2 3
  2 3
    3
  2 3
1 2 3
*/

/*
A B C
  B C
    C
  B C
A B C
 */
public class NumberPattern2 {
    private static void display(int n) {
        int k = 0;
        for (int i = 1; i <= n * 2 - 1; i++) {
            k = i <= n ? k + 1 : k - 1;
            for (int j = 1; j <= n; j++) {
                if (j >= k)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void displayChar(int n) {
        int k = 0;
        for (int i = 1; i <= n * 2 - 1; i++) {
            k = i <= n ? k + 1 : k - 1;
            for (int j = 1; j <= n; j++) {
                if (j >= k)
                    System.out.print((char) (64 + j) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void displayStar(int n) {
        int k = 0;
        for (int i = 1; i <= n * 2 - 1; i++) {
            k = i <= n ? k + 1 : k - 1;
            for (int j = 1; j <= n; j++) {
                if (j >= k)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = sc.nextInt();
        display(n);
        displayStar(n);
        displayChar(n);
    }
}