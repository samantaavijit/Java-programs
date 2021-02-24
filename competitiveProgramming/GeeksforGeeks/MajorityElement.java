package com.avijitsamanta.competitiveProgramming.GeeksforGeeks;

public class MajorityElement {
    private static int majorityElement(int[] a) {
        int n = a.length;
        int element = a[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (element == a[i]) count++;
            else count--;
            if (count == 0) {
                element = a[i];
                count = 1;
            }
        }
        count = 0;
        for (int val : a)
            if (element == val) count++;
        return count > n / 2 ? element : -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 1};
        System.out.println(majorityElement(a));
        System.out.println(majorityElement(new int[]{1, 2, 3}));
    }
}
