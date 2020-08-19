package com.avijitsamanta.Problem;

public class BoardGame {
    public static int sum = 0;

    private static int calculate(int[][] board, int n) {
        dfs(board, 0, 0, n, n);
        sum = (sum / 2) + board[n - 1][n - 1]; // FOR LAST VALUE
        return sum;
    }

    private static void dfs(int[][] arr, int x, int y, int r, int c) {
        if (x >= r - 1 || y >= c - 1)
            return;
        if (arr[x][y + 1] < arr[x + 1][y]) { // RIGHT
            sum = (sum / 2) + arr[x][y + 1];
            dfs(arr, x, y + 1, r, c);
        } else {                           // DOWN
            sum = (sum / 2) + arr[x + 1][y];
            dfs(arr, x + 1, y, r, c);
        }
    }

    public static void main(String[] args) {
        int[][] board = {{0, 3, 9, 6},
                {1, 4, 4, 5},
                {8, 2, 5, 4},
                {1, 8, 5, 9}};

        int[][] bb = {{0 ,82 ,2, 6, 7},
                {4 ,3 ,1, 5, 21},
                { 6 ,4 ,20, 2, 8},
                {6, 6, 64, 1 ,8},
                {1, 65 ,1, 6, 4}};

        System.out.println(calculate(board, board.length));
        System.out.println(calculate(bb, bb.length));

    }
}
