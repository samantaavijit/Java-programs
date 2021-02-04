package com.avijitsamanta.StringPrograms;

public class NumberOfOccurrenceOfCharacterInString {
    private static int countOccurrenceOfCharacter(String str, char c) {
        return str.length() - str.replaceAll(String.valueOf(c), "").length();
    }

    public static void main(String[] args) {
        System.out.println(countOccurrenceOfCharacter("Hello World",'l'));
        System.out.println(countOccurrenceOfCharacter("Avijit Samanta",'a'));
    }
}
