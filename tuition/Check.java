package com.avijitsamanta.tuition;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number ");
        int n = scanner.nextInt();
        int max = -99, min = 99;
        int c;
        while (n != 0) {
            c = n % 10;
            if (max < c)
                max = c;
            if (min > c)
                min = c;
            n /= 10;
        }

        System.out.println("Result is " + (max - min));

    }
}
