package com.avijitsamanta.LeetCode30DaysChallengeApril2020;

public class NumberofIslands {

    public int numIslands(char[][] arr) {
        int c = 0, row = arr.length, col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == '1') {
                    c++;
                    dfs(arr, i, j, row, col);
                }

            }
        }

        for (char i[] : arr) {
            for (char j : i)
                System.out.print(j + " ");
            System.out.println();
        }
        return c;
    }

    public void dfs(char[][] arr, int x, int y, int r, int c) {

        if (x < 0 || x >= r || y < 0 || y >= c || arr[x][y] != '1')
            return;

        arr[x][y] = '2';

        dfs(arr, x - 1, y, r, c); // TOP
        dfs(arr, x, y - 1, r, c);// LEFT
        dfs(arr, x + 1, y, r, c); // DOWN
        dfs(arr, x, y + 1, r, c); // RIGHT
    }

    public static void main(String[] args) {
        char[][] arr = { { '1', '1', '1', '0', '0' }, { '1', '0', '1', '1', '1' } };
        System.out.println(new NumberofIslands().numIslands(arr));

    }
}