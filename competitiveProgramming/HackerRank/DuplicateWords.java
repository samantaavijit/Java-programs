package com.avijitsamanta.competitiveProgramming.HackerRank;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    public static void main(String[] args) {
        System.out.print("Enter the String ");
        String str = new Scanner(System.in).nextLine();

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher m = pattern.matcher(str);

        while (m.find()) {
            str = str.replaceAll(m.group(),
                    m.group(1));
        }
        System.out.println(str);


    }
}
