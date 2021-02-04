package com.avijitsamanta.ArrayPrograms;


public class InsertAtSpecificPosition {

    private static void display(int[] arr) {
        for (int element : arr)
            System.out.print(element + " ");
    }

    private static void insertAt(int[] arr, int position, int val) {
        if (position >= 1 && position <= arr.length) {
            for (int i = position - 1; i < arr.length; i++) {
                int item = arr[i];
                arr[i] = val;
                val = item;

            }
        } else
            System.out.println("Position not found");
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
//        Arrays.fill(arr, -1);

        insertAt(arr, 3, 29);
        insertAt(arr, 1, 10);

        display(arr);
    }


}
