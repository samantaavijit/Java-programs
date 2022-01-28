package com.avijitsamanta.star;

public class Star2 {
    private static void display(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        display(5);
    }
}
