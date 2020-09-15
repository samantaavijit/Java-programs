package com.avijitsamanta.Collage;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit ");
        int n = sc.nextInt();

        int a = -1, b = 1, c = 0;
        System.out.println("Fibonacci Up to " + n);
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        a = -1;
        b = 1;
        System.out.println("\nFibonacci Up to " + n + "th term");
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            if (c > n)
                break;
            System.out.print(c + " ");
        }
    }
}
