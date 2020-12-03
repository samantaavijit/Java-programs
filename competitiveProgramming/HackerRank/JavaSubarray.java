package com.avijitsamanta.competitiveProgramming.HackerRank;


public class JavaSubarray {
    public static void main(String[] args) {

        int[] a ={1,-2,4,-5,1};
        int n = a.length;

        int ne = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++)
                    sum += a[k];
                if (sum < 0) ne++;
            }
        }
        System.out.println(ne);
    }
}
