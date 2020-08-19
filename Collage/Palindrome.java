package com.avijitsamanta.Collage;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.print("Enter the number ");
        int n = new Scanner(System.in).nextInt();
        int a = n, sum = 0;
        while (a > 0) {
            sum = sum * 10 + (a % 10);
            a /= 10;
        }
        if (sum == n)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
