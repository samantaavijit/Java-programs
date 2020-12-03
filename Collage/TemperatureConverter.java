package com.avijitsamanta.Collage;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature ");
        float temp = sc.nextFloat();
        System.out.print("1. For Celsius to Fahrenheit\n2. For Fahrenheit to Celsius\nEnter your choice ");
        switch (sc.nextInt()) {
            case 1:
                float f = ((9 * temp) / 5) + 32;
                System.out.println(f);
                break;
            case 2:
                float c = ((temp - 32) * 5) / 9;
                System.out.println(c);
                break;
            default:
                System.out.println("Wrong choice plz try again!!!");
        }
    }
}
