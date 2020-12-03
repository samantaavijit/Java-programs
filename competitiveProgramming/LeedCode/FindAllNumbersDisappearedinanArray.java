package com.avijitsamanta.competitiveProgramming.LeedCode;

import java.util.ArrayList;
import java.util.List;

/*
Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 */
public class FindAllNumbersDisappearedinanArray {

    private List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0)
                nums[index] *= -1;

        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(i + 1);
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        return result;
    }


    public static void main(String[] args) {
        FindAllNumbersDisappearedinanArray obj = new FindAllNumbersDisappearedinanArray();
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        obj.findDisappearedNumbers(arr);

    }
}
