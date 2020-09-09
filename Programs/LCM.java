package com.avijitsamanta.Programs;

import java.util.Scanner;

public class LCM {
    private static long gcd(long a, long b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    private static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two number ");
        long a=scanner.nextLong();
        long b=scanner.nextLong();
        System.out.println(lcm(a,b));
    }
}
