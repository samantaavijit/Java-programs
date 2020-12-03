package com.avijitsamanta.competitiveProgramming.LeetCode30DaysChallengeApril2020;

/**
 * @author Avijit Samanta
 * 
 *         Input --> [2,3,1,1,4] Output--> true Explanation: Jump 1 step from
 *         index 0 to 1, then 3 steps to the last index.
 * 
 *         Input: [3,2,1,0,4] Output: false Explanation: You will always arrive
 *         at index 3 no matter what. Its maximum jump length is 0, which makes
 *         it impossible to reach the last index.
 *
 */
public class JumpGame {

	public boolean canJump(int[] nums) {
		int jump = 0;
		for (int i = 0; i < nums.length; i++) {
			if (jump < i)
				return false;
			jump = Math.max(jump, i + nums[i]);
		}
		return true;
	}

	public static void main(String[] args) {
		JumpGame jumpGame = new JumpGame();
		int[] nums = { 1, 5, 0, 0, 3, 0, 0, };

		System.out.println(jumpGame.canJump(nums));

	}

}
