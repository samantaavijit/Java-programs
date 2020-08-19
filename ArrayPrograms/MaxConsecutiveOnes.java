/*
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
*/
public class MaxConsecutiveOnes {

    private int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count++;
            else {
                max = Math.max(max, count);
                count = 0;
            }

        }

        max = Math.max(max, count);
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        obj.findMaxConsecutiveOnes(nums);
    }
}