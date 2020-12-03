package com.avijitsamanta.competitiveProgramming.GeeksforGeeks;

import java.math.BigInteger;

public class SumOfBigIntegers {
    private static BigInteger add(BigInteger x, BigInteger y) {
        System.out.println(x.add(y));
        System.out.println(x.multiply(y));
        return new BigInteger(String.valueOf(x)).add(y);

    }

    public static void main(String[] args) {
        System.out.println(add(new BigInteger("250"), new BigInteger("250")));
    }
}
