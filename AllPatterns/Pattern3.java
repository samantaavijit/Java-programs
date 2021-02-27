package com.avijitsamanta.AllPatterns;

/*
1 0 1 0 1
1 0 1 0
1 0 1
1 0
1
 */
public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2 == 0 ? "0 " : "1 ");
            }
            System.out.println();
        }
    }
}
