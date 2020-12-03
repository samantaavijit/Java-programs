package com.avijitsamanta.competitiveProgramming.LeetCode30DaysChallengeApril2020;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        map.put(0, -1);
        int count = 0, c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count--;
            else
                count++;
            if (map.containsKey(count))
                c = Math.max(c, i - map.get(count));
            else
                map.put(count, i);
        }

        return c;
    }

    public static void main(String[] args) {

    }
}