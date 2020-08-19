package com.avijitsamanta.ArrayPrograms;

/*
Given an array, return length of the longest subarray of non- negative integers.
Input:
2
9
2 3 4 -1 -2 1 5 6 3
10
1 0 0 1 -1 -1 0 0 1 0

Output:
4
4
 */
public class LengthOfLongestSubArray {
    private static void count(int[] arr) {
        int c = 0, max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val >= 0) {
                c++;
                max = Math.max(c, max);
            }
            else {
                c = 0;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int []arr={12 ,-1 ,-7 ,8 ,-15, 30, 16 ,28};
        count(arr);
    }
}
