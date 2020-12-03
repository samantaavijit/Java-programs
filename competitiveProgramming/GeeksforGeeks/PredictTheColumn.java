package com.avijitsamanta.competitiveProgramming.GeeksforGeeks;

/*
Given a matrix(2D array) M of size N*N consisting of 0s and 1s only.
The task is to find the column with maximum number of 0s.

1 1 1 0
1 1 0 0
1 1 1 0
1 0 0 0
 */
public class PredictTheColumn {


    private int columnWithMaxZero(int[][] a, int n) {
        int col = 0, count, temp = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++)
                if (a[j][i] == 0) count++;
            if (count > temp) {
                col = i;
                temp = count;
            }
        }

        System.out.println(col);
        return col;
    }


    public static void main(String[] args) {
        PredictTheColumn obj = new PredictTheColumn();
        int[][] arr = {{0, 1, 1, 0}
                , {0, 1, 1, 0}
                , {1, 1, 0, 0}
                , {0, 0, 0, 0}};
        obj.columnWithMaxZero(arr, arr.length);
    }
}
