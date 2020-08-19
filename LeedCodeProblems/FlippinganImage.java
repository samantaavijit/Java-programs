package com.avijitsamanta.LeedCodeProblems;

/*
Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
*/
public class FlippinganImage {

    private int[][] flipAndInvertImage(int[][] A) {
        int res[][] = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            int c = 0;
            for (int j = A[0].length - 1; j >= 0; j--) {
                res[i][c++] = A[i][j];
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (res[i][j] == 1)
                    res[i][j] = 0;
                else
                    res[i][j] = 1;
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < A[0].length; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }

        int m = A.length;
        int n = A[0].length;

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n / 2; ++j) {
                int v1 = A[i][j];
                int v2 = A[i][n - j - 1];
                A[i][j] = 1 - v2;
                A[i][n - j - 1] = 1 - v1;
            }

            if ((n & 1) == 1)
                A[i][n / 2] = 1 - A[i][n / 2];
        }
        System.out.println("---------------------------");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < A[0].length; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }

        return res;
    }

    public static void main(String[] args) {
        FlippinganImage obj = new FlippinganImage();
        int A[][] = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        obj.flipAndInvertImage(A);
    }
}