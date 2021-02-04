package com.avijitsamanta.DataStructure.Algorithm;

import java.util.Scanner;

public class NQueen {

    private static boolean isSave(int[][] arr, int x, int y, int n) {
        // check rows
        for (int i = 0; i < x; i++)
            if (arr[i][y] == 1) return false;

        // check columns
        for (int i = 0; i < y; i++)
            if (arr[x][i] == 1) return false;

        // check diagonal left \
        int row = x, col = y;
        while (row >= 0 && col >= 0) {
            if (arr[row][col] == 1) return false;
            row--;
            col--;
        }

        // check diagonal right /
        row = x;
        col = y;

        while (row >= 0 && col < n) {
            if (arr[row][col] == 1) return false;
            row--;
            col++;
        }
        return true;
    }

    private static boolean gameBoard(int[][] arr, int x, int n) {
        if (x >= n) return true;
        for (int col = 0; col < n; col++) {
            if (isSave(arr, x, col, n)) {
                arr[x][col] = 1;

                if (gameBoard(arr, x + 1, n))
                    return true;
                arr[x][col] = 0; // backtrack
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size ");
        int n = new Scanner(System.in).nextInt();
        int[][] arr = new int[n][n];


        if (gameBoard(arr, 0, n))
            for (int[] a : arr) {
                for (int val : a)
                    System.out.print(val + " ");
                System.out.println();
            }

    }
}
