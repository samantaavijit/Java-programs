package com.avijitsamanta.ArrayPrograms;

/*
Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
*/
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        // nums[len++]=nums[nums.length-1];

        for (int j = 0; j < i+1; j++) {
            System.out.print(nums[j] + " ");
        }

        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        obj.removeDuplicates(nums);
    }
}