package com.avijitsamanta.competitiveProgramming.HackerRank;

import java.math.BigDecimal;
import java.util.*;


public class JavaBigDecimal {
    private static void solution1(String[] s) {
        Arrays.sort(s, Collections.reverseOrder((a1, a2) -> {
            //convert to big decimal inside comparator
            //so permanent string values are never changed
            //aka you only use the BigDecimal values to
            //compare the strings!
            BigDecimal a = new BigDecimal(a1);
            BigDecimal b = new BigDecimal(a2);
            return a.compareTo(b);
        }));

        for (String value : s) {
            System.out.println(value);
        }
    }

    private static void solution2(String []s){
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a); // descending order
            }
        };

        Arrays.sort(s, 0, s.length, customComparator);

        for (String value : s) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        String[] s = {
                "-100",
                "50",
                "0",
                "56.6",
                "90",
                "0.12",
                ".12",
                "02.34",
                "000.000"};

        solution1(s);

    }
}
