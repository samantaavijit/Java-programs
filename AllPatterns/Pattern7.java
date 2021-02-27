package com.avijitsamanta.AllPatterns;

/*
1 2 3 4 5
2 2 3 4 5
3 3 3 4 5
4 4 4 4 5
5 5 5 5 5
 */
public class Pattern7 {
    private static void print1(int n) {
        int a;
        for (int i = 1; i <= n; i++) {
            a = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(a + " ");
                if (j >=i) a++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print1(n);
    }
}
