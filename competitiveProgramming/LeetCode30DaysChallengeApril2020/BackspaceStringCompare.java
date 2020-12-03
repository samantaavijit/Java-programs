package com.avijitsamanta.competitiveProgramming.LeetCode30DaysChallengeApril2020;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        return abc(S).equals(abc(T));
    }

    private String abc(String str) {
        String res = "";
        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (res.length() > 0)
                    res = res.substring(0, res.length() - 1);
            } else
                res += c;
        }
        return res;
    }

    public static void main(String[] args) {
        BackspaceStringCompare obj = new BackspaceStringCompare();

        System.out.print(obj.backspaceCompare("y#fo##f", "y#f#o##f"));

    }
}