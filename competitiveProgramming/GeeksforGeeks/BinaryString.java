package com.avijitsamanta.competitiveProgramming.GeeksforGeeks;

/*
Given a binary string S. The task is to count the number of substrings that start and end with 1.
For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.
 */
public class BinaryString {
    private int binarySubstring(int n, String str) {
        int count = 0;
        int left = 0, right = n - 1;
        while (left < n) {
            if (str.charAt(left) != '1')
                left++;
            else {
                right = n - 1;
                while (right >= 0) {
                    if (left != right && str.charAt(right) == '1') {
                        System.out.println(str.substring(left, right));
                        count++;
                        left++;
                    }
                    right--;
                }
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        BinaryString obj = new BinaryString();
        String str = "00100101";
        obj.binarySubstring(str.length(), str);
    }
}
