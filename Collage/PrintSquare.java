package com.avijitsamanta.Collage;

import java.util.Scanner;

public class PrintSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print((i*i) + " ");
        }
    }
}
