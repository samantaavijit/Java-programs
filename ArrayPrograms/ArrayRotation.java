package com.avijitsamanta.ArrayPrograms;

/*
4
1 2 3 4 5
5 1 2 3 4
 */
public class ArrayRotation {
    private static void arrayRightRotation(int[] arr, int n) {
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
        for (int a = 0; a < n; a++) {
            int last = arr[arr.length - 1];
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
            arr[0] = last;
            for (int val : arr)
                System.out.print(val + " ");
            System.out.println();
        }

    }

    private static void arrayLeftRotation(int[] arr, int n) {
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
        for (int a = 0; a < n; a++) {
            int first = arr[0];
            System.arraycopy(arr, 1, arr, 0, arr.length - 1);
            arr[arr.length - 1] = first;

            for (int val : arr)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] right = {1, 2, 3, 4, 5};
        arrayRightRotation(right, 4);
        System.out.println("-------------------------");
        int[] left = {1, 2, 3, 4, 5};
        arrayLeftRotation(left, 4);
    }
}
