package com.avijitsamanta.Collage;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        System.out.print("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
        if (sum == n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
