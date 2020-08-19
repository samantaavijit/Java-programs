package com.avijitsamanta.Collage;
import java.util.Scanner;

public class LargestAndSmallestFrom3 {
    public static void main(String[] args) {
        System.out.print("Enter three numbers ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("largest is " + a);
                if (b > c)
                    System.out.println("Smallest is " + c);
                else
                    System.out.println("Smallest is " + b);
            } else {
                System.out.println("largest is " + c);
                System.out.println("Smallest is " + b);
            }
        }
        else if (b > c) {
            System.out.println("largest is " + b);
            if (a > c)
                System.out.println("Smallest is " + c);
            else
                System.out.println("Smallest id " + a);
        }
        else {
            System.out.println("largest is "+c);
            if (b>a)
                System.out.println("Smallest is "+a);
            else
                System.out.println("Smallest is "+b);
        }
    }
}
