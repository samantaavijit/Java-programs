package com.avijitsamanta.DS_ALGO;

import java.util.*;


public class KthSmallestElement {
    private static int kthSmall(int[] a, int k) {
        Arrays.sort(a);
        return a[k - 1];
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(kthSmall(arr, k));
    }
}
