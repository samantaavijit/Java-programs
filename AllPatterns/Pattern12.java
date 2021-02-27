package com.avijitsamanta.AllPatterns;

/*
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
 */
public class Pattern12 {
    private static void print1(int n) {
        int a = 0, b = n * 2, k;
        for (int i = 1; i < n * 2; i++) {
            if (i <= n) a++;
            else a--;
            if (i <= n) b--;
            else b++;
            k = n;
            for (int j = 1; j < n * 2; j++) {
                System.out.print(k + " ");
                if (j < a) k--;
                if (j >= b) k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print1(n);
    }
}
