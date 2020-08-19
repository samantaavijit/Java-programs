package com.avijitsamanta.Programs;

public class BinaryToDecimal {
    private int getDecimal(String str) {
        int ans = 0;
        for (char c : str.toCharArray()) {
            System.out.println("First "+ ans);
            ans = ans << 1;
            System.out.println("<< "+ ans);
            ans += Integer.parseInt(String.valueOf(c));
            System.out.println("add "+ ans);
        }
        return ans;

    }

    public static void main(String[] args) {
        BinaryToDecimal obj = new BinaryToDecimal();
        System.out.println(obj.getDecimal("101"));

    }
}