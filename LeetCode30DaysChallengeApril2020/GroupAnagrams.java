package com.avijitsamanta.LeetCode30DaysChallengeApril2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    private void groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return;
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();

            Arrays.sort(ca);

            String key = String.valueOf(ca);

            if (!ans.containsKey(key))
                ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }

        ans.entrySet().forEach(entry -> {
            System.out.println(entry.getValue());
        });

    }

    public static void main(String[] args) {
        GroupAnagrams obj = new GroupAnagrams();
        String arr[] = { "eat", "tea", "tan", "ate", "nat", "bat" };

        obj.groupAnagrams(arr);
    }
}