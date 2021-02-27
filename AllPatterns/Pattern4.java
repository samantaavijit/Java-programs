package com.avijitsamanta.AllPatterns;

/*
5 5 5 5 5
5 4 4 4 4
5 4 3 3 3
5 4 3 2 2
5 4 3 2 1
 */
public class Pattern4 {
    private static void print1(int n) {
        int a;
        for (int i = 1; i <= n; i++) {
            a = n;
            for (int j = 1; j <= n; j++) {
                System.out.print(a + " ");
                if (j < i) {
                    a--;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print1(n);
    }
}
