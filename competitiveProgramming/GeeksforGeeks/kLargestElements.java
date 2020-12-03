package com.avijitsamanta.competitiveProgramming.GeeksforGeeks;

import java.util.Arrays;

/*
Input:
N = 5, K = 2
Arr[] = {12, 5, 787, 1, 23}
Output: 787 23
Explanation: 1st largest element in the
array is 787 and second largest is 23.
 */
public class kLargestElements {
    private static int[] kLargest(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        int c = 0;
        for (int i = n - 1; i >= n - k; i--) {
            res[c++] = arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int n = arr.length;
        int k = 3;
        int[] res = kLargest(arr, n, k);
        for (int item : res)
            System.out.print(item + " ");
    }
}
