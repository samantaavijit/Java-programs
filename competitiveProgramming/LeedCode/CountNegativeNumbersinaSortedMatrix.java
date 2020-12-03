package com.avijitsamanta.competitiveProgramming.LeedCode;
/*
Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
*/

public class CountNegativeNumbersinaSortedMatrix {
    private int countNegatives(int[][] grid) {
        int count = 0;
        int i = grid.length - 1;
        int j = 0;
        while (i >= 0 && j < grid[0].length) {
            if (grid[i][j] < 0) {
                count += grid[0].length - j;
                i--;
                continue;
            }
            j++;
        }
        return count;

    }

    private void aa(int[][] grid, int i, int j) {
        int count = 0;
        if (i < 0 && j >= grid[0].length)
            return;
        if (grid[i][j] < 0) {
            count += grid[0].length - j;
            aa(grid, i--, j++);
        } else
            aa(grid, i, j++);
    }

    public static void main(String[] args) {
        CountNegativeNumbersinaSortedMatrix obj = new CountNegativeNumbersinaSortedMatrix();
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};

        System.out.println(obj.countNegatives(grid));

    }
}