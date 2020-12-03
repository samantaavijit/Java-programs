package com.avijitsamanta.competitiveProgramming.LeedCode;

import java.util.ArrayList;
import java.util.List;

/*
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]

*/
public class CreateTargetArrayintheGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {
        int arr[] = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            list.add(index[i], nums[i]);
        for (int i = 0; i < nums.length; i++)
            arr[i] = list.get(i);

        return arr;
    }

    public static void main(String[] args) {

        CreateTargetArrayintheGivenOrder obj = new CreateTargetArrayintheGivenOrder();
        int nums[] = { 0, 1, 2, 3, 4 };
        int target[] = { 0, 1, 2, 2, 1 };
        int res[] = obj.createTargetArray(nums, target);
        for (int a : res)
            System.out.print(a + " ");
    }
}