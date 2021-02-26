package com.avijitsamanta.competitiveProgramming.LeedCode;

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class ShuffleTheArray {
    private static int[] shuffle(int[] a, int n) {
        int[] res = new int[n * 2];
        int c = 0;
        for (int i = 0; i < n; i++) {
            res[c++] = a[i];
            res[c++] = a[n + i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int val : shuffle(a, a.length / 2))
            System.out.print(val + " ");
    }
}
