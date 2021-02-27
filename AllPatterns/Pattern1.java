package com.avijitsamanta.AllPatterns;


/*
 * * * * * * * * *
 * * * *   * * * *
 * * *       * * *
 * *           * *
 *               *
 */
/*
 1 2 3 4 5 4 3 2 1
 1 2 3 4   4 3 2 1
 1 2 3       3 2 1
 1 2           2 1
 1               1
 */

/*
 A B C D E D C B A
 A B C D   D C B A
 A B C       C B A
 A B           B A
 A               A
 */
public class Pattern1 {
    private static void display(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < (n * 2); j++) {
                if (j <= n + 1 - i || j >= n - 1 + i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void displayNumbers(int n) {
        int count;
        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int j = 1; j < (n * 2); j++) {

                if (j <= n) {
                    count++;
                } else {
                    count--;
                }
                if (j <= n + 1 - i || j >= n - 1 + i)
                    System.out.print(count + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void displayChar(int n) {
        int count;
        for (int i = 1; i <= n; i++) {
            count = 64;
            for (int j = 1; j < (n * 2); j++) {

                if (j <= n) {
                    count++;
                } else {
                    count--;
                }
                if (j <= n + 1 - i || j >= n - 1 + i)
                    System.out.print(((char) count) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        display(n);
        displayNumbers(n);
        displayChar(n);
    }
}
