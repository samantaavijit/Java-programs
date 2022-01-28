package com.avijitsamanta.star;

/**
 * @author Avijit Samanta
 */

/*

 *
 **
 ***
 ****
 *****

 */
public class Star1 {

    private static void display(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        display(5);
    }
}
