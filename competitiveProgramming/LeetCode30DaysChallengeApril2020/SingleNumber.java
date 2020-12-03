package com.avijitsamanta.competitiveProgramming.LeetCode30DaysChallengeApril2020;

import java.util.Scanner;

/**
 * SingleNumber LeedCode 30 Days Challenge
 * 
 * Input: [2,2,1] Output: 1
 * 
 * [4,1,2,1,2] Output: 4
 */
public class SingleNumber {

    private int singleNumber(int[] arr) {
        int a = arr[0];
        for (int i = 1; i < arr.length; i++)
            a ^= arr[i];
        return a;
    }

    public static void main(String[] args) {
        System.out.print("Enter the limit ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Value ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        SingleNumber obg = new SingleNumber();
        int b = obg.singleNumber(arr);

        System.out.print("Single Number is " + b);
        sc.close();
    }
}