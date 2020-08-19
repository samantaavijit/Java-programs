package com.avijitsamanta.Collage;

import java.util.Scanner;

public class SumOfODDNumber {
    public static void main(String[] args) {
        System.out.print("Enter the limit ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
    }
}
