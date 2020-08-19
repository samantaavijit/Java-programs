package com.avijitsamanta.GeeksforGeeks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayListOperation {

    private static final HashMap<Character, Integer> myMap = new HashMap<>();

    public static void insert(ArrayList<Character> clist, char c) {
        clist.add(c);
        if (myMap.containsKey(c)) {
            int val = myMap.get(c);
            myMap.put(c, val + 1);
        } else
            myMap.put(c, 1);

    }

    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c) {

        if (myMap.containsKey(c))
            System.out.println(myMap.get(c));
        else
            System.out.println("Not Present");

    }

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        char key;
        while (isTrue) {
            System.out.print("Enter the heck Option ");
            char check = sc.next().charAt(0);
            switch (check) {
                case 'i':
                    System.out.print("Enter the insert key ");
                    key = sc.next().charAt(0);
                    insert(list, key);
                    break;
                case 'f':
                    System.out.print("Enter the Search key ");
                    key = sc.next().charAt(0);
                    freq(list, key);
                    break;
                default:
                    isTrue = false;
                    break;
            }
        }

    }

}
