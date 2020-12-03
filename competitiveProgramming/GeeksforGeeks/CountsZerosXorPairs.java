package com.avijitsamanta.competitiveProgramming.GeeksforGeeks;

import java.util.Scanner;

public class CountsZerosXorPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            int c = 0;

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if ((arr[i] ^ arr[j]) == 0)
                        c++;
                }
            }
            System.out.println(c);
        }
    }
}