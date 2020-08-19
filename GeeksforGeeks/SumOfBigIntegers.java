package com.avijitsamanta.GeeksforGeeks;

import java.math.BigInteger;

public class SumOfBigIntegers {
   private static BigInteger add(BigInteger x, BigInteger y) {
       return  new BigInteger(String.valueOf(x)).add(y);
    }

    public static void main(String[] args) {
       add(new BigInteger("250"),new BigInteger("250"));
    }
}
