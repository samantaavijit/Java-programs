package com.avijitsamanta.Collage;

import java.util.Scanner;

public class SumOfSquareNumber {
    public static void main(String[] args) {
        System.out.print("Enter the limit ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println("result is " + sum);
    }
}
