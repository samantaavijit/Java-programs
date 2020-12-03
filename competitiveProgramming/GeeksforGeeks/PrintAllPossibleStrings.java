package com.avijitsamanta.competitiveProgramming.GeeksforGeeks;

/*
Given a string str your task is to complete the function printSpaceString which
takes only one argument the string str and
prints all possible strings that can be made by placing spaces (zero or one) in between them.
Input
abc

Output
abc$ab c$a bc$a b c$
 */
public class PrintAllPossibleStrings {
    private static void printSpace(String str) {
        generate(str, "", 0);
        System.out.println();
    }
    private static int remainderWith7(String str)
    {
        return (new java.math.BigInteger(str).mod(new java.math.BigInteger("7"))).intValue();
    }
    private static void generate(String str, String temp, int i) {
        if (i == str.length() - 1) {
            temp = temp + str.charAt(i);
            System.out.print(temp + "$");
            return;
        }
        temp = temp + str.charAt(i);
        generate(str, temp, i + 1);
        temp = temp + " ";
        generate(str, temp, i + 1);
    }

    public static void main(String[] args) {
        printSpace("abc");
        printSpace("xyz");
        System.out.println(remainderWith7("123456987456982245687452661478541125859555411525447552855125585"));
    }
}
