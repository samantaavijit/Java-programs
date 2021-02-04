package com.avijitsamanta.ds_algo;
/*
https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 */

import java.util.Arrays;

public class FindMinAndMax {
    static class Pair {
        int max, min;
    }

    // First approach
    private static Pair getMinMax(int[] arr) {
        Pair maxmin = new Pair();
        if (arr.length == 1) {
            maxmin.max = arr[0];
            maxmin.min = arr[0];
            return maxmin;
        }
        if (arr[0] > arr[1]) {
            maxmin.max = arr[0];
            maxmin.min = arr[1];
        } else {
            maxmin.max = arr[1];
            maxmin.min = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (maxmin.max < arr[i])
                maxmin.max = arr[i];
            else if (maxmin.min > arr[i])
                maxmin.min = arr[i];
        }

        return maxmin;
    }

    // Second approach
    private static Pair getMinMax(int[] arr, int low, int high) {
        Pair minmax = new Pair();
        Pair left;
        Pair right;

        /* If there is only on element */
        if (low == high) {
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }
        /* If there are two elements */
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }
        int mid = (low + high) / 2;
        left = getMinMax(arr, low, mid);
        right = getMinMax(arr, mid + 1, high);

        minmax.min = Math.min(left.min, right.min);
        minmax.max = Math.max(left.max, right.max);

        return minmax;
    }

    // Third approach
    private static Pair getMinMax(int[] arr, int n) {
        Pair minmax = new Pair();
        int i;
        /* If array has even number of elements then
    initialize the first two elements as minimum and
    maximum */
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                minmax.max = arr[0];
                minmax.min = arr[1];
            } else {
                minmax.max = arr[1];
                minmax.min = arr[0];

            }
            i = 2;
        } else {
            minmax.max = arr[0];
            minmax.min = arr[0];
            i = 1;
        }
        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > minmax.max)
                    minmax.max = arr[i];
                if (arr[i + 1] < minmax.min)
                    minmax.min = arr[i + 1];
            } else {
                if (arr[i + 1] > minmax.max)
                    minmax.max = arr[i + 1];
                if (arr[i] < minmax.min)
                    minmax.min = arr[i];
            }

            i += 2;
        }
        return minmax;
    }

    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
//        Pair minmax = getMinMax(arr);
//        Pair minmax = getMinMax(arr, 0, arr.length - 1);
        long a = System.nanoTime();
        Pair minmax = getMinMax(arr, arr.length);
        System.out.println("Minimum is " + minmax.min);
        System.out.println("Maximum is " + minmax.max);
        System.out.println(System.nanoTime() - a);

        a = System.nanoTime();
        int min = 99999, max = -999999;
        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println(System.nanoTime() - a);

    }
}
