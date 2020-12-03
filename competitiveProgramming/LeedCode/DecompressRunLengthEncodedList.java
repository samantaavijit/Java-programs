package com.avijitsamanta.competitiveProgramming.LeedCode;/*
Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
*/

public class DecompressRunLengthEncodedList {

    private int[] decompressRLElist(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i += 2)
            count += nums[i];
        int arr[] = new int[count];
        int n = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int a = 1;
            while (a++ <= nums[i])
                arr[n++] = nums[i + 1];
        }

        return arr;
    }

    public static void main(String[] args) {
        DecompressRunLengthEncodedList obj = new DecompressRunLengthEncodedList();
        int nums[] = { 1, 3, 4, 5, 9, 4 };
        int arr[] = obj.decompressRLElist(nums);
        for (int a : arr)
            System.out.print(a + " ");
    }
}