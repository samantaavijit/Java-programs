package com.avijitsamanta.LeetCode30DaysChallengeApril2020;

public class PerformStringShifts {

    private String stringShift(String s, int[][] shift) {

        for (int[] a : shift) {
            if (a[0] == 0) // left shift
                s = s.substring(a[1]) + s.substring(0, a[1]);
            else
                s = s.substring(s.length() - a[1]) + s.substring(0, s.length() - a[1]);
        }

        return s;
    }

    public static void main(String[] args) {
        PerformStringShifts obj = new PerformStringShifts();
        int a[][] = { { 1, 1 }, { 1, 1 }, { 0, 2 }, { 1, 3 } };
        System.out.println(obj.stringShift("abcdefg", a));
    }
}