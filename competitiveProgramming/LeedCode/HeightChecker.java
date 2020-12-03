package com.avijitsamanta.competitiveProgramming.LeedCode;

import java.util.Arrays;

/*
Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation:
Current array : [1,1,4,2,1,3]
Target array  : [1,1,1,2,3,4]
On index 2 (0-based) we have 4 vs 1 so we have to move this student.
On index 4 (0-based) we have 1 vs 3 so we have to move this student.
On index 5 (0-based) we have 3 vs 4 so we have to move this student.
 */
public class HeightChecker {
    private int heightChecker(int[] heights) {
        int count = 0;
        int[] arr = new int[heights.length];
        System.arraycopy(heights, 0, arr, 0, heights.length);

        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            if (arr[i] != heights[i])
                count++;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        HeightChecker obj = new HeightChecker();
        int[] heights = {1, 1, 4, 2, 1, 3};
        obj.heightChecker(heights);
    }
}
