package com.avijitsamanta.competitiveProgramming.GeeksforGeeks;

/*
Given an array A[ ] your task is
to complete the function max_val which finds the maximum value of abs(i – j) * min(arr[i], arr[j])
where i and j vary from 0 to n-1.

Input
3 2 1 4
8 1 9 4
Output
9
16
 */
public class FindMaximumValue {

    private int max_val(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++)
                max = Math.max(max, (Math.abs(i - j) * Math.min(arr[i], arr[j])));
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        FindMaximumValue obj = new FindMaximumValue();
        int[] arr = {3, 2, 1, 4};
        obj.max_val(arr, arr.length);
    }
}
