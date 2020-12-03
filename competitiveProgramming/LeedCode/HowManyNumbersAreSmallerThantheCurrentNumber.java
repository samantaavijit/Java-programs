package com.avijitsamanta.competitiveProgramming.LeedCode;

/**
 * @author Avijit Samanta Input: nums = [8,1,2,2,3] Output: [4,0,1,1,3]
 * Explanation: For nums[0]=8 there exist four smaller numbers than it
 * (1, 2, 2 and 3). For nums[1]=1 does not exist any smaller number than
 * it. For nums[2]=2 there exist one smaller number than it (1). For
 * nums[3]=2 there exist one smaller number than it (1). For nums[4]=3
 * there exist three smaller numbers than it (1, 2 and 2).
 */
public class HowManyNumbersAreSmallerThantheCurrentNumber {

    private int[] smallerNumbersThanCurrent(int[] nums) {
        /*
         * 2 <= nums.length <= 500 0 <= nums[i] <= 100
         */
        int n = nums.length;
        int[] fre_arr = new int[101];

        for (int i = 0; i < n; i++) {
            fre_arr[nums[i]]++;
        }
        for (int i = 1; i < 101; i++) {
            fre_arr[i] += fre_arr[i - 1];
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                nums[i] = 0;
            } else {
                nums[i] = fre_arr[nums[i] - 1];
            }
        }
        for (int val : nums)
            System.out.print(val + " ");
        return nums;
    }

    public static void main(String[] args) {
        HowManyNumbersAreSmallerThantheCurrentNumber obj = new HowManyNumbersAreSmallerThantheCurrentNumber();

        int[] arr = {8, 1, 2, 2, 3};
        obj.smallerNumbersThanCurrent(arr);
    }

}
