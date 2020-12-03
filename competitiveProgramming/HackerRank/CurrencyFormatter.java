package com.avijitsamanta.competitiveProgramming.HackerRank;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {
    public static void main(String[] args) {

        double a = 12324.134;


                /* Create custom Locale for India.
          I used the "IANA Language Subtag Registry" to find India's country code */
        Locale indiaLocale = new Locale("en", "IN");

        /* Create NumberFormats using Locales */
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(a));
        System.out.println("India: " + india.format(a));
        System.out.println("China: " + china.format(a));
        System.out.println("France: " + france.format(a));
    }
}
