package com.avijitsamanta.ArrayPrograms;

public class PrintElementsAtEvenPosition {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 2; i < arr.length; i += 2)
            System.out.print(arr[i] + " ");
    }
}
