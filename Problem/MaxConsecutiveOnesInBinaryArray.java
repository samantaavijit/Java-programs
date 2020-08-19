package com.avijitsamanta.Problem;

public class MaxConsecutiveOnesInBinaryArray {

    private static int calculate(char[] arr) {
        int count = 0, max = Integer.MIN_VALUE;
        for (char val : arr) {
            if (val == '0') {
                max = Math.max(max, count);
                count = 0;
            } else count++;
        }
        return Math.max(max, count);
    }

    public static void main(String[] args) {
        char []arr=Integer.toBinaryString(15).toCharArray();
        System.out.println(calculate(arr));
    }
}
