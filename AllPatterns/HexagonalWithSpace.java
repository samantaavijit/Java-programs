package com.avijitsamanta.AllPatterns;

import java.util.Scanner;
/*
**** ****
***   ***
**     **
*       *

*       *
**     **
***   ***
**** ****
*/

public class HexagonalWithSpace {
    void display(int n) {
        int a = n + 1;
        int b = n - 1;
        for (int i = 1; i < n * 2; i++) {
            if (i <= n) {
                a--;
                b++;
            } else {
                a++;
                b--;
            }
            for (int j = 1; j < n * 2; j++) {
                if (j >= a && j <= b)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HexagonalWithSpace obj = new HexagonalWithSpace();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit(ODD NUMBER) ");
        int n = sc.nextInt();
        if (n % 2 != 0)
            obj.display(n);
        else
            System.out.print("Plz Enter Odd number ");
        sc.close();
    }
}