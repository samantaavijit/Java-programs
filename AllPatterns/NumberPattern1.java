package com.avijitsamanta.AllPatterns;

import java.util.Scanner;

/*
1
3 2
4 5 6
10 9 8 7
11 12 13 14 15
*/
public class NumberPattern1 {

    int i, j, k = 0, l;

    void display(int n) {
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                k = k + i - 1;
            } else
                k = k + 1;
            l = k;

            for (j = 1; j <= i; j++) {

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

    public static void main(String[] args) {

        NumberPattern1 obj = new NumberPattern1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        obj.display(sc.nextInt());
    }
}