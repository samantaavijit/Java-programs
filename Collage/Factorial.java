package com.avijitsamanta.Collage;

import java.util.Scanner;

public class Factorial {
    private static long fact(int n) {
        if (n == 1) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial is "+fact(n));
    }
}
