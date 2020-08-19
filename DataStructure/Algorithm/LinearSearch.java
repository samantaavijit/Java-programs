package com.avijitsamanta.DataStructure.Algorithm;

public class LinearSearch {

    private int find(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == item)
                return i;

        return -1;
    }

    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        int arr[] = { 1, 2, 3, 4, 5, 100, 84, 45, 20, 9, 47 };

        System.out.println(obj.find(arr, 45));
    }
}