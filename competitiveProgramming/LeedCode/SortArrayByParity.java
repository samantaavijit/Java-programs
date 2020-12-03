package com.avijitsamanta.competitiveProgramming.LeedCode;

/*
Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
*/
public class SortArrayByParity {

    private int[] sortArrayByParity(int[] A) {
        int res[] = new int[A.length];
        int count = 0;
        for (int i : A) {
            if (i % 2 == 0)
                res[count++] = i;
        }
        for (int i : A) {
            if (i % 2 != 0)
                res[count++] = i;
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
        return res;
    }

    public static void main(String[] args) {
        SortArrayByParity obj = new SortArrayByParity();
        int A[] = { 3, 1, 2, 4 };
        obj.sortArrayByParity(A);
    }
}