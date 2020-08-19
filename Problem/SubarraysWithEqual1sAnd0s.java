package com.avijitsamanta.Problem;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithEqual1sAnd0s {
    private static int countSubarrWithEqualZeroAndOne(int[] arr, int N) {
        int count = 0, sum = 0;
        for (int i = 0; i < N; i++) {
            sum = arr[i] == 0 ? -1 : 1;
            for (int j = i + 1; j < N; j++) {
                sum += arr[j] == 0 ? -1 : 1;
                if (sum == 0)
                    count++;
            }
        }
        return count;
    }

    private static int countt(int[] arr, int n) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            //Replacing 0's in array with -1
            if (arr[i] == 0)
                arr[i] = -1;

            sum += arr[i];

            //If sum = 0, it implies number of 0's and 1's are
            //equal from arr[0]..arr[i]
            if (sum == 0)
                count++;

            if (myMap.containsKey(sum))
                count += myMap.get(sum);

            if (!myMap.containsKey(sum))
                myMap.put(sum, 1);
            else
                myMap.put(sum, myMap.get(sum) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1};
        System.out.println(countSubarrWithEqualZeroAndOne(arr, arr.length));
        System.out.println(countt(arr, arr.length));
    }
}
