package com.avijitsamanta.LeetCode30DaysChallengeApril2020;

/**
 * MaximumSubarray
 */
public class MaximumSubarray {

    private static int maxSubArray(int[] nums) {
        int meh=0,msf=Integer.MIN_VALUE;
        for (int num : nums) {
            meh += num;
            if (meh < num)
                meh = num;
            if (msf < meh)
                msf = meh;
        }
        
      return msf;
        
    }

    public static void main(String[] args) {
        int[] mums = { -1, -5, -10, -8, 5, 8, 9, 70, 48, -89, 9 };
        System.out.print("Maximum Sub Array is "+ maxSubArray(mums));
    }
}