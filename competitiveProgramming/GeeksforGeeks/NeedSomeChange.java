package com.avijitsamanta.competitiveProgramming.GeeksforGeeks;

/*
Given an array A of N positive integers. The task is to swap every ith element of the array with (i+2)th element.
Input:

1 2 3 4 5

Output:
3 4 5 2 1
 */
public class NeedSomeChange {

    private void swapElements(int[] arr, int sizeof_array) {
        for (int i = 0; i < sizeof_array - 2; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
        }
    }

    public static void main(String[] args) {
        NeedSomeChange obj = new NeedSomeChange();
        int[] arr = {1, 2, 3, 4, 5};
        obj.swapElements(arr, arr.length);
        for (int val : arr)
            System.out.print(val + " ");
    }
}
