package com.avijitsamanta.competitiveProgramming.LeetCode30DaysChallengeApril2020;

public class MinimumPathSum {

    private int minPathSum(int[][] grid) {
        int res[][] = new int[grid.length][grid[0].length];
        res[0][0] = grid[0][0];

        for (int i = 1; i < grid[0].length; i++) { // Add 1st Row
            res[0][i] = res[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < grid.length; i++) {// Add 1st Column
            res[i][0] = res[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                res[i][j] = Math.min(res[i][j - 1] + grid[i][j], res[i - 1][j] + grid[i][j]);
            }
        }

         System.out.println(res[grid.length-1][grid[0].length-1]);

        return res[grid.length - 1][grid[0].length - 1];

    }

    public static void main(String[] args) {
        MinimumPathSum obj = new MinimumPathSum();
        int grid[][] = { { 1, 2, 5 }, { 3, 2, 1 } };
        obj.minPathSum(grid);
    }
}