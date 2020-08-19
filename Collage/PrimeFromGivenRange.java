package com.avijitsamanta.Collage;

import java.util.Scanner;

public class PrimeFromGivenRange {

    private static boolean isPrime(int n) {
        if (n == 2) return true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter the limit ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
}
