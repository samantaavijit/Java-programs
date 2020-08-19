package com.avijitsamanta.Problem;

/*
Input : arr[] = { 1, 2, 3 }
Output : 2
All pairs of array
1 ^ 2 = 3
1 ^ 3 = 2
2 ^ 3 = 1

Input : arr[] = { 1, 2, 3, 4 }
Output : 4
 */
public class CountPairsOddXor {
    private static void count(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] ^ a[j]) % 2 != 0)
                    c++;
            }
        }
        System.out.println(c);

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        count(a);
    }
}
