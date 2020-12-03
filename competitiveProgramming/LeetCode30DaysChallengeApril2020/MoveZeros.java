package com.avijitsamanta.competitiveProgramming.LeetCode30DaysChallengeApril2020;

/**
 * MoveZeros
 */
public class MoveZeros {

    private void moveZeros(int[] nums) {

        for (int a : nums)
            System.out.print(a+" ");
        System.out.println("\nAfter Moves Zeros");    
        int pos = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nums[pos++] = nums[i];

        for (int i = pos; i < nums.length; i++)
            nums[i] = 0;

        for (int a : nums)
            System.out.print(a+" ");
    }

    public static void main(String[] args) {
        int[] arr = { 5, 0, 1, 2, 0, 0, 0, 3, -1, -5, 0 };
        MoveZeros ogj = new MoveZeros();
        ogj.moveZeros(arr);
    }
}