package com.avijitsamanta.competitiveProgramming.LeedCode;

/*
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
 */
public class RichestCustomerWealth {
    private static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int c;
        for (int[] arr : accounts) {
            c = 0;
            for (int val : arr) {
                c += val;
            }
            max = Math.max(max, c);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3},
                {5, -1, -10}};
        System.out.println(maximumWealth(ar));
    }
}
