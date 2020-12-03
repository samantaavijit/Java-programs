package com.avijitsamanta.competitiveProgramming.GeeksforGeeks;

/*
Input: arr[] = {1, 2}
Output: 4
All pairs in array are (1, 1), (1, 2)
                       (2, 1), (2, 2)
Sum of bit differences = 0 + 2 +
                         2 + 0
                      = 4

Input:  arr[] = {1, 3, 5}
Output: 8
All pairs in array are (1, 1), (1, 3), (1, 5)
                       (3, 1), (3, 3) (3, 5),
                       (5, 1), (5, 3), (5, 5)
Sum of bit differences =  0 + 1 + 1 +
                          1 + 0 + 2 +
                          1 + 2 + 0
                       = 8

https://www.geeksforgeeks.org/sum-of-bit-differences-among-all-pairs/
 */
public class SumOfBitDifferencesAllParis {
    private static int sumBitDifferences(int[] arr, int n) {
        int ans = 0; // Initialize result

        // traverse over all bits
        for (int i = 0; i < 32; i++) {

            // count number of elements
            // with i'th bit set
            int count = 0;

            for (int j = 0; j < n; j++)
                if ((arr[j] & (1 << i)) == 0)
                    count++;

            // Add "count * (n - count) * 2"
            // to the answer
            ans += (count * (n - count) * 2);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        System.out.println(sumBitDifferences(arr, arr.length));
    }
}
