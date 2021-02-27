package com.avijitsamanta.AllPatterns;

/*
5 5 5 5 5
5 4 4 4 4
5 4 3 3 3
5 4 3 2 2
5 4 3 2 1
5 4 3 2 2
5 4 3 3 3
5 4 4 4 4
5 5 5 5 5
 */
public class Pattern8 {
    private static void print1(int n) {
        int a = 0, k;
        for (int i = 1; i < n * 2; i++) {
            if (i <= n) a++;
            else a--;
            k = 5;
            for (int j = 1; j <= n; j++) {
                System.out.print(k + " ");
                if (j < a) k--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print1(n);
    }
}
