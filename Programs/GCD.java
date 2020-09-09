package com.avijitsamanta.Programs;

import java.util.Scanner;

public class GCD {
    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two number ");
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.println(gcd(a, b));
        System.out.println("With out Recursion");
        long gcd = 0;
        for (long i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        System.out.println(gcd);
    }
}
