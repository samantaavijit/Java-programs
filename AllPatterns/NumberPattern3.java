package com.avijitsamanta.AllPatterns;

import java.util.Scanner;

/*
55555
54444
54333
54322
54321
*/
public class NumberPattern3 {

    int i, j, k;

    void display(int n) {
        for (i = 1; i <= n; i++) {
            k = n;
            for (j = 1; j <= n; j++) {

                if (i != 1 && j < i) {
                    System.out.print(k--);
                } else
                    System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        NumberPattern3 obj = new NumberPattern3();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        obj.display(sc.nextInt());
    }
}