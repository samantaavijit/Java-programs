package com.avijitsamanta.competitiveProgramming.HackerRank;

public class ValidIPAddress {
    private static final String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    private static final String pattern = zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255;

    public static void main(String[] args) {
        String ip = "255.255.255.255";
        String a2="000.000.000.000";

        System.out.println(ip.matches(pattern));
        System.out.println(a2.matches(pattern));
    }
}
