package com.avijitsamanta.DataStructure.Algorithm;

public class Backtracking1 {
    public static int cost = 0;

    private static void gameBoard(int[][] arr, int x, int y, int n, String ans) {

        if (x < 0 || y < 0 || x >= n || y >= n || arr[x][y] == -1 || arr[x][y] == 1) return;

        if (x == n - 1 && y == n - 1) {
            System.out.println(ans + " Cost is " + cost);
            return;
        }

        arr[x][y] = -1;
        cost++;
        gameBoard(arr, x - 1, y, n, ans + "T"); // TOP
        gameBoard(arr, x + 1, y, n, ans + "D"); // DOWN
        gameBoard(arr, x, y - 1, n, ans + "L"); // LEFT
        gameBoard(arr, x, y + 1, n, ans + "R"); // RIGHT
        arr[x][y] = 0; // backtrack
        cost--;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1},
                {0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 1, 0}
        };

        gameBoard(arr, 0, 0, arr.length, "");
    }
}
