package com.avijitsamanta.Collage;

import java.util.Scanner;

public class PerfectNumberFromGivenRange {
    private static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.print("Enter the limit ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i))
                System.out.print(i + " ");
        }
    }
}
