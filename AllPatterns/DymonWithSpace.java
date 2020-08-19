package com.avijitsamanta.AllPatterns;

import java.util.Scanner;

/*
  *
 * *
*   *
 * *
  *
*/
public class DymonWithSpace {
    private void display(int n) {
        int i, j, k, a = 1, b, c;
        b = n / 2;
        c = n - b;

        for (i = 1; i <= c; i++) {

            for (j = i; j <= c - 1; j++)
                System.out.print(" ");

            for (k = 1; k <= a; k++) {
                if (k == 1 || k == a)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            a += 2;
            System.out.print("\n");
        }

        a = b * 2 - 1;
        for (i = 1; i <= b; i++) {

            for (j = 1; j <= i; j++)
                System.out.print(" ");

            for (k = 1; k <= a; k++) {
                if (k == 1 || k == a)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            a -= 2;
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        DymonWithSpace obj = new DymonWithSpace();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit(ODD NUMBER) ");
        int n = sc.nextInt();
        if (n % 2 != 0)
            obj.display(n);
        else
            System.out.print("Plz Enter Odd number ");

    }
}