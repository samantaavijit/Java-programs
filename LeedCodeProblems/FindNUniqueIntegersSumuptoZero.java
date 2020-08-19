package com.avijitsamanta.LeedCodeProblems;

/*
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Input: n = 1
Output: [0]
*/
public class FindNUniqueIntegersSumuptoZero {
    private int[] sumZero(int n) {
        int res[] = new int[n];
        if (n == 1) {
            res[0] = 0;
            return res;
        }
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            res[count++] = -i;
            res[count++] = i;
        }
        if (n % 2 != 0)
            res[count] = 0;

        for (int a : res)
            System.out.print(a + " ");
        System.out.println();
        return res;
    }

    public static void main(String[] args) {
        FindNUniqueIntegersSumuptoZero obj = new FindNUniqueIntegersSumuptoZero();
        obj.sumZero(6);
        obj.sumZero(5);
    }
}