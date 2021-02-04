package com.avijitsamanta.ArrayPrograms;

/*
Given nums = [0,1,2,2,3,0,4,2], val = 2,

Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.

Note that the order of those five elements can be arbitrary.

It doesn't matter what values are set beyond the returned length.
*/
public class RemoveElement {

    private int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0;

        while (i < len) {
            if (nums[i] == val)
                nums[i] = nums[--len];
            else
                i++;
        }

        for (int j = 0; j < len; j++)
            System.out.print(nums[j] + " ");

        return len;
    }

    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();
        int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        obj.removeElement(nums, 2);
    }
}