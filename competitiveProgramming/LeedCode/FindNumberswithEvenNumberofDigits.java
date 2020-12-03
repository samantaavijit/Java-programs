package com.avijitsamanta.competitiveProgramming.LeedCode;/*
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
*/

public class FindNumberswithEvenNumberofDigits {

    private int findNumbers(int[] nums) {
        int count = 0;
        for (int a : nums) {
            if (String.valueOf(a).length() % 2 == 0)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        FindNumberswithEvenNumberofDigits obj = new FindNumberswithEvenNumberofDigits();
        int nums[] = { 1234, 25, 13235, 2528, 4569 };
        System.out.println(obj.findNumbers(nums));

    }
}