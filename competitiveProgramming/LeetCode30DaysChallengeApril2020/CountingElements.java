package com.avijitsamanta.competitiveProgramming.LeetCode30DaysChallengeApril2020;

import java.util.Arrays;

public class CountingElements {

    private int countElements(int[] arr) {
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            boolean test = Arrays.binarySearch(arr, arr[i] + 1) > 0;
            if (test)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 3, 5, 0 };

        CountingElements obj = new CountingElements();
        System.out.print("Result is " + obj.countElements(arr));
    }
}