package com.avijitsamanta.competitiveProgramming.HackerRank;

import java.math.BigInteger;

public class JavaPrimalityTest {
    private static boolean isPrime(String s) {
        BigInteger b = new BigInteger(s);
        return b.isProbablePrime(1);
    }

    public static void main(String[] args) {
        String s="15865255263565211235655441321655456454665";
        System.out.println(isPrime(s));
    }
}
