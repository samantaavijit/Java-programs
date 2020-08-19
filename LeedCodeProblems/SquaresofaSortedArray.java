package com.avijitsamanta.LeedCodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresofaSortedArray {

    private int[] sortedSquares(int[] A) {
        int left = 0, right = A.length - 1;
        int res[] = new int[A.length];
        int index = A.length - 1;

        while (left <= right) {
            if (Math.abs(A[left]) >= Math.abs(A[right])) {
                res[index--] = A[left] * A[left];
                left++;
            }

            else {
                res[index--] = A[right] * A[right];
                right--;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        SquaresofaSortedArray obj = new SquaresofaSortedArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the value of array ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int[] res = obj.sortedSquares(arr);
        for (int a : res)
            System.out.print(a + " ");
    }
}