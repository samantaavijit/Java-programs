package com.avijitsamanta.StringPrograms;

public class Permutation {
    private static String swap(String str, int i, int j) {
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }

    private static void permutation(String str, int i, int n) {
        if (i == n)
            System.out.print(str+" ");
        for (int a = i; a <= n; a++) {
            str = swap(str, i, a);
            permutation(str, i + 1, n);
            str = swap(str, i, a);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permutation(str, 0, n - 1);
    }
}
