package com.avijitsamanta.Collage;

import java.util.Scanner;

public class LTrim_RTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string for LTrim ");
        String str = sc.nextLine();

        while (str.startsWith(" "))
            str = str.substring(1);

        System.out.println("lTrim is $" + str + "$");

        System.out.print("Enter the string for RTrim ");
        str = sc.nextLine();

        while (str.endsWith(" ")) {
            str = str.substring(0, str.length() - 1);
        }
        System.out.println("rTrim is $" + str + "$");
    }
}
