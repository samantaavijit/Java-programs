package com.avijitsamanta.ArrayPrograms;

import java.util.*;

/*
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
*/

public class MergeSortedArray {

    private void merge(int[] a, int m, int[] b, int n) {
        int c = 0;
        for (int i = m; i < a.length; i++)
            a[i] = b[c++];

        Arrays.sort(a);
    }

    public static void main(String[] args) {

        MergeSortedArray obj = new MergeSortedArray();
        int[] arr = { 1, 2, 5, 0, 0, 0, 0 };
        int[] arr2 = { 2, 8, 9, 15 };
        obj.merge(arr, arr.length- arr2.length, arr2, arr2.length);
        for (int a : arr)
            System.out.print(a + " ");

        
    }
}