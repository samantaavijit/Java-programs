package com.avijitsamanta.AllPatterns;

import java.util.Scanner;

/*
    0
   101
  21012
 3210123
432101234
*/

public class NumberPattern {

    void display(int n) {
        int i, j, k;
        for (i = 1; i <= n; i++) {
            k = i;
            for (j = 1; j <= n * 2 - 1; j++) {

                if (j >= n + 1 - i && j <= n - 1 + i) {
                    if (j <= n)
                        k--;
                    else
                        k++;
                    System.out.print(k);
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberPattern obj = new NumberPattern();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit ");
        obj.display(sc.nextInt());
    }
}