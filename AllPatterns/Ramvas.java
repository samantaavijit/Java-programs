package com.avijitsamanta.AllPatterns;

import java.util.Scanner;

public class Ramvas {

    private void display(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n * 2; j++) {
                if (j >= n + 1 - i && j <= n * 2 - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ramvas obj = new Ramvas();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        obj.display(sc.nextInt());
    }
}