package com.avijitsamanta.Problem;

public class SubarraySumWithEqualK {
    private static void check(int[] arr, int k) {
        int sum, count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                    sum = arr[i];
                }
                if (sum>k)
                    sum=arr[i];
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        check(arr, 6);
    }
}
