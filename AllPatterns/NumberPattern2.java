package com.avijitsamanta.AllPatterns;

import java.util.Scanner;

/*
1 2 3
  2 3
    3
  2 3
1 2 3
*/
public class NumberPattern2 {

    int i, j, k = 0;

    void display(int n) {
        for (i = 1; i <= n * 2 - 1; i++) {
            if (i <= n)
                k++;
            else
                k--;

            for (j = 1; j <= n; j++) {

                if (j >= k)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberPattern2 obj = new NumberPattern2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        obj.display(sc.nextInt());
    }
}