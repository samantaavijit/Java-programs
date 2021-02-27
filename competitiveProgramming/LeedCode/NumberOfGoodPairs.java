package com.avijitsamanta.competitiveProgramming.LeedCode;

/*
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed
 */
public class NumberOfGoodPairs {
    private static int numIdenticalPairs(int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 1};
        System.out.println(numIdenticalPairs(a));
    }
}
