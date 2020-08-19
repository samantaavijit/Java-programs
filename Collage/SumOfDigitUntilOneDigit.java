package com.avijitsamanta.Collage;

import java.util.Scanner;

public class SumOfDigitUntilOneDigit {
    private static int sumOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number ");
        int n = new Scanner(System.in).nextInt();
        int result = sumOfDigit(n);
        while (result > 9) {
            result = sumOfDigit(result);
        }
        System.out.println("Sum is " + result);
    }
}
