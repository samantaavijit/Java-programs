package com.avijitsamanta.Programs;

public class FindFirstLastDigitAndSum {
    public static void main(String[] args) {
        int a = 12345;
        int firstDigit = Integer.parseInt(String.valueOf(a).charAt(0) + "");
        int lastDigit = a % 10;

        System.out.println("First digit " + firstDigit + "\nLast digit " + lastDigit + "\nSum " + (firstDigit + lastDigit));
    }
}
