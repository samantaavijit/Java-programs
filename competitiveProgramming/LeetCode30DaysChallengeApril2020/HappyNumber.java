package com.avijitsamanta.competitiveProgramming.LeetCode30DaysChallengeApril2020;

import java.util.*;

/**
 * HappyNumber
 */
public class HappyNumber {

    private int sumSqrDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        if (n == 1 || n == 7)
            return true;
        while (n > 9) {
            n = sumSqrDigit(n);
            if (n == 1)
                return true;
        }
        if (n == 7)
            return true;
        return false;
    }

    public static void main(String[] args) {
        HappyNumber obj = new HappyNumber();
        System.out.print("Enter the Number ");
        
        if (obj.isHappy(new Scanner(System.in).nextInt()))
            System.out.print("Number is Happy ");
        else
            System.out.print("Number is not Happy ");
    }
}