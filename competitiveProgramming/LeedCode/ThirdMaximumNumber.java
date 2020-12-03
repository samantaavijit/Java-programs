package com.avijitsamanta.competitiveProgramming.LeedCode;

public class ThirdMaximumNumber {

    private static int thirdMax(int[] arr) {
        int max = Integer.MIN_VALUE, second_max = Integer.MIN_VALUE, third_max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                third_max = second_max;
                second_max = max;
                max = val;
            } else if (val > second_max) {
                third_max = second_max;
                second_max = val;
            } else if (val > third_max)
                third_max = val;
        }
        if (third_max==Integer.MIN_VALUE)
            return max;
        return third_max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(thirdMax(arr));
        int[] arr1 = {1, 2};
        System.out.println(thirdMax(arr1));
        int[] arr2 = {1, 2, 2, 4, 5};
        System.out.println(thirdMax(arr2));

    }
}
