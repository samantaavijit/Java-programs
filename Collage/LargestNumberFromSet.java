package com.avijitsamanta.Collage;

import java.util.Scanner;

public class LargestNumberFromSet {
    public static void main(String[] args) {
        System.out.print("Enter the limit ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        System.out.println("Enter the number ");
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if (max < a)
                max = a;
        }
        System.out.println("Max is " + max);
    }
}
