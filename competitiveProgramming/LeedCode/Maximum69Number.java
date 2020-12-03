package com.avijitsamanta.competitiveProgramming.LeedCode;

/*
Input: num = 9669
Output: 9969
Explanation: 
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666. 
The maximum number is 9969.
*/
public class Maximum69Number {

    private int maximum69Number(int num) {
        int max = num;
        int length = String.valueOf(num).length();
        int n = (int) Math.pow(10, length);
        for (int i = 1; i <= length; i++) {
            if (num / n == 6)
                return (max + 3 * n);
            num %= n;
            n /= 10;
        }
        return max;
    }

    public static void main(String[] args) {
        Maximum69Number obj = new Maximum69Number();
        System.out.println(obj.maximum69Number(96666669));

    }
}