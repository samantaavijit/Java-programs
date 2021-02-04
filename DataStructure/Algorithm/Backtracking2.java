package com.avijitsamanta.DataStructure.Algorithm;

public class Backtracking2 {
    private static int cost = 0;
    private static String ans = "";

    private static void gameBoard(int[][] arr, int x, int y, int n) {
        if (x >= n || y >= n) return;
        if (x < n - 1 && y < n - 1) {
            if (arr[x][y] + arr[x][y + 1] < arr[x][y] + arr[x + 1][y]) {// RIGHT
                arr[x][y + 1] += arr[x][y];
                gameBoard(arr, x, y + 1, n);
                System.out.println("R");
            } else {  // DOWN
                arr[x + 1][y] += arr[x][y];
                gameBoard(arr, x + 1, y, n);
                System.out.println("D");
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {2, 5, 3, 6},
                {8, 1, 15, 1},
                {2, 15, 3, 10},
                {1, 1, 2, 0}
        };

        gameBoard(arr, 0, 0, arr.length);
        for (int[] a : arr) {
            for (int i : a)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
