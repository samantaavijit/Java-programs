package com.avijitsamanta.GeeksforGeeks;

/*
Input:
5 4 3 2 1
Output:
4 5 2 3 1

Given an unsorted array arr of size N, rearrange the elements of array such that number at the odd index is greater than the number at the previous even index. The task is to complete the function formatArray() which will return formatted array.
*/
public class Playwithanarray {

    private int[] formatArray(int[] a, int n) {
        for (int even = 0, odd = 1; odd < n; even += 2, odd += 2) {
            if (a[odd] < a[even]) {
                int temp = a[even];
                a[even] = a[odd];
                a[odd] = temp;
            }
        }
        for (int val : a)
            System.out.print(val + " ");
        return a;
    }

    public static void main(String[] args) {
        Playwithanarray obj = new Playwithanarray();
        int a[] = { 10, 20, 5, 2, 8, 3, 1 };
        obj.formatArray(a, a.length);
    }
}