package com.avijitsamanta.AllPatterns;

/*
5 4 3 2 1
5 4 3 2 2
5 4 3 3 3
5 4 4 4 4
5 5 5 5 5
 */
public class Pattern6 {
    private static void print1(int n) {
        int a;
        for (int i = 1; i <= n; i++) {
            a = n;
            for (int j = 1; j <= n; j++) {
                System.out.print(a + " ");
                if (j < n + 1 - i) a--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print1(n);
    }
}
