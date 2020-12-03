package com.avijitsamanta.competitiveProgramming.LeedCode;/*
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'
Input: s = "RLLLLRRRLR"
Output: 3
Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
*/

public class SplitaStringinBalancedStrings {

    private int balancedStringSplit(String s) {
        int LR = 0, count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L')
                LR++;
            else
                LR--;
            if (LR == 0)
                count++;
        }
        return count;

    }

    public static void main(String[] args) {

        SplitaStringinBalancedStrings obj = new SplitaStringinBalancedStrings();
        System.out.println(obj.balancedStringSplit("RLRRRLLRLL"));
    }
}