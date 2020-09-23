package com.avijitsamanta.Collage;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name ");
        String name = sc.nextLine();

        String[] arr = name.split(" ");
        String result = arr[0].charAt(0) + "";

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equalsIgnoreCase("of") || !arr[i].equalsIgnoreCase("and")) {
                result = result.concat("." + arr[i].charAt(0));
            }
        }
        System.out.println(result.toUpperCase());


        String result2 = "";
        for (int i = 0; i < arr.length - 1; i++) {
            result2 = result2.concat(arr[i].charAt(0) + ".");
        }
        String ls = arr[arr.length - 1];
        result2 = result2.toUpperCase().concat(ls.substring(0, 1).toUpperCase() + ls.substring(1));
        System.out.println(result2);

    }
}
