package com.avijitsamanta.GeeksforGeeks;
/*
Input:
1 2 3 4 7 9
0 1 2 1 1 4

4 8 7 5 1
4 48 3 0 1 1 5

Output:
4 5 5 6 6 6
5 6 6 6 3
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CountingElementsInTwoArrays {
    private ArrayList<Integer> countEleLessThanOrEqual(int[] arr1, int[] arr2, int m, int n) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count;
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            count = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] >= arr2[j]) {
                    count++;
                    hashMap.put(i, count);
                } else {
                    hashMap.put(i, count);
                    break;
                }
            }
        }

        for (Integer val : hashMap.keySet()) {
            System.out.print(hashMap.get(val) + " ");
        }
        return new ArrayList<>(hashMap.values());
    }

    public static void main(String[] args) {
        CountingElementsInTwoArrays obj = new CountingElementsInTwoArrays();
        int[] a = {-2,1, 2, 3, 4, 7, 9,-10};
        int[] b = {0, 1, 2, 1, 1, 4};
        obj.countEleLessThanOrEqual(a, b, a.length, b.length);
    }
}
