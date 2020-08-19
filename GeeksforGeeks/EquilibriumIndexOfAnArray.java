package com.avijitsamanta.GeeksforGeeks;

/*
Input
1 2 0 3
1 1 1 1

Output
2
-1
 */
public class EquilibriumIndexOfAnArray {
    private int findEquilibrium(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        if (n == 2)
            return -1;
        int[] sum = new int[n];
        sum[0] = arr[0];
        for (int i = 1; i < n; i++)
            sum[i] = sum[i - 1] + arr[i];
        for (int i = 1; i < n - 1; i++) {
            int lSum = sum[i - 1];
            int rSum = sum[n - 1] - sum[i];
            if(lSum==rSum)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        EquilibriumIndexOfAnArray obj = new EquilibriumIndexOfAnArray();
        int[] arr = {1, 2, 0, 3};
        System.out.println(obj.findEquilibrium(arr, arr.length));
    }
}
