package com.avijitsamanta.Programs;

import java.util.Scanner;

public class Swap {
    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }

    private static void swap(float a, float b) {
        float temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    private static void swap(char a, char b) {
        char temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Integer numbers : ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        swap(a, b);
        System.out.print("Enter two Float numbers : ");
        float x, y;
        x = sc.nextFloat();
        y = sc.nextFloat();
        swap(x, y);

        System.out.print("Enter two Characters : ");
        char c, d;
        c = sc.next().charAt(0);
        d = sc.next().charAt(0);
        swap(c, d);
    }
}
