package com.avijitsamanta.GeeksforGeeks;

/*
Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array.
 The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.
 Input
1
4
8 3 1 2
Output
29

Explanation
Above the configuration possible by rotating elements are
3 1 2 8 here sum is 3*0+1*1+2*2+8*3 = 29
1 2 8 3 here sum is 1*0+2*1+8*2+3*3 = 27
2 8 3 1 here sum is 2*0+8*1+3*2+1*3 = 17
8 3 1 2 here sum is 8*0+3*1+1*2+2*3 =  11
Here the max sum is 29
 */
public class MaxSumInTheConfiguration {

    private static void rotated(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr[arr.length - 1];
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
            arr[0] = last;
        }

        for (int val : arr)
            System.out.print(val + " ");
    }

    private static int max_sum(int[] A, int n) {
        int sum = 0;
        int maxVal = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i];
            maxVal += i * A[i];
        }
        int curr = maxVal;

        for (int j = 1; j < n; j++) {
            curr += sum - n * A[n - j];
            maxVal = Math.max(maxVal, curr);
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 2};
        System.out.println(max_sum(arr, arr.length));
    }
}
