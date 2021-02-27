package com.avijitsamanta.AllPatterns;

/*
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
 */
public class Pattern10 {
    private static void print1(int n) {
        int a;
        for (int i = 1; i <= n; i++) {
            a = n;
            for (int j = 1; j < n * 2; j++) {
                System.out.print(a + " ");
                if (j < i) a--;
                if (j >= n * 2 - i) a++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print1(n);
    }
}
