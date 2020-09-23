package com.avijitsamanta.AllPatterns;

import java.util.Scanner;
/*
        0
      1 0 1
    2 1 0 1 2
  3 2 1 0 1 2 3
4 3 2 1 0 1 2 3 4
 */

/*
        A
      B A B
    C B A B C
  D C B A B C D
E D C B A B C D E
 */

public class Triangle {

    private static void display(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n * 2; j++) {
                if (j >= n + 1 - i && j <= n - 1 + i)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void displayNumber(int n) {
        for (int i = 1, k; i <= n; i++) {
            k = i;
            for (int j = 1; j < n * 2; j++) {
                if (j >= n + 1 - i && j <= n - 1 + i) {
                    k = j <= n ? k - 1 : k + 1;
                    System.out.print(k + " ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void displayChar(int n) {
        for (int i = 1, k; i <= n; i++) {
            k = 65 + i;
            for (int j = 1; j < n * 2; j++) {
                if (j >= n + 1 - i && j <= n - 1 + i) {
                    k = j <= n ? k - 1 : k + 1;
                    System.out.print((char) k + " ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit ");
        int n = sc.nextInt();
        display(n);
        displayNumber(n);
        displayChar(n);

    }

}
