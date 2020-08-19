package com.avijitsamanta.StringPrograms;

public class RemoveAllDuplicatesFromAGivenString {
    private static void removeDuplicate( String str) {
        for (int i = 0; i < str.length(); i++) {
            String key=str.substring(0, i + 1);
            final String s = str.substring(i+1).replaceAll(String.valueOf(str.charAt(i)), "");
            str=key+s;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        removeDuplicate("geeksforgeeks");
        removeDuplicate("HappyNewYear");
    }
}
