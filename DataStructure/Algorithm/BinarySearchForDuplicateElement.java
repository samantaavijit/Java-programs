package com.avijitsamanta.DataStructure.Algorithm;

public class BinarySearchForDuplicateElement {
    private int binarySearchForDuplicateVal(int[] arr, int item) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == item) {
                if (arr[mid - 1] == item)
                    end = mid - 1;
                else
                    return mid;
            } else if (arr[mid] > item)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchForDuplicateElement obj = new BinarySearchForDuplicateElement();
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(obj.binarySearchForDuplicateVal(arr, 2));

    }


}
