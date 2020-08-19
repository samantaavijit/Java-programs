package com.avijitsamanta.Problem;

import java.util.ArrayList;
import java.util.Objects;

/*
Given an array arr[] of positive integers of size N. Reverse every sub-array of K group elements.
Input
4
5 3
1 2 3 4 5
4 3
5 6 8 9
4 7
5 6 8 9
8 3
1 2 3 4 5 6 7 8

Output
3 2 1 5 4
8 6 5 9
9 8 6 5
3 2 1 6 5 4 8 7
 */
public class ReverseArrayInGroups {

    private static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
        if (n < k||mv==null)
            return null;
        int i = 0, j = k - 1;
        for (int a = 1; a <= n / k; a++) {
            rev(mv, i, j);
            i+=k;
            j+=k;
        }

        rev(mv, i, n-1);

        return mv;
    }

    private static void rev(ArrayList<Integer> mv, int i, int j) {
        while (i < j) {
            Integer temp = mv.get(i);
            mv.set(i, mv.get(j));
            mv.set(j, temp);
            i++;
            j--;
        }
    }


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

       list= reverseInGroups(list, list.size(), 2);

        for (int i = 0; i< Objects.requireNonNull(list).size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
