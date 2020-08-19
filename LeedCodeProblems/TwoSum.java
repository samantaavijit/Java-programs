package com.avijitsamanta.LeedCodeProblems;

/*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class TwoSum {

    private int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[] { i, j };
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int nums[] = { 2, 7, 11, 15 };
        int res[] = obj.twoSum(nums, 13);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}