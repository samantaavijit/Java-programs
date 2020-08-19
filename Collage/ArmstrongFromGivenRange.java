package com.avijitsamanta.Collage;

import java.util.Scanner;

public class ArmstrongFromGivenRange {
    private static boolean isArmstrong(int n) {
        int a = n, b = n;
        int digit = 0, sum = 0;

        while (a > 0) {
            digit++;
            a /= 10;
        }
        while (b > 0) {
            int c = b % 10;
            sum += Math.pow(c, digit);
            b /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.print("Enter the limit ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i))
                System.out.println(i);
        }
    }
}
