package com.avijitsamanta.competitiveProgramming.Problem;

class ArrayRoated {
    private void displayArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void rotatedNinty(int[][] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length) / 2; j++) {
                temp = arr[i][arr.length - j - 1];
                arr[i][arr.length - j - 1] = arr[i][j];
                arr[i][j] = temp;
            }
        }

    }

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};


        ArrayRoated obj = new ArrayRoated();
        obj.displayArray(arr);
        obj.rotatedNinty(arr);
        System.out.println();
        obj.displayArray(arr);

    }
}