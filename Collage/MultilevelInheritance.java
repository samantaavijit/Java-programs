package com.avijitsamanta.Collage;

import java.util.Scanner;

class Aa {
    public int add(int a, int b) {
        return a + b;
    }
}

class Bb extends Aa {
    public int sub(int a, int b) {
        return a - b;
    }
}

class Cc extends Bb {
    public int multi(int a, int b) {
        return a * b;
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Cc obj = new Cc();
        System.out.println("Addition is "+obj.add(a,b));
        System.out.println("Subtraction is "+obj.sub(a,b));
        System.out.println("Multiplication is "+obj.multi(a,b));
    }
}
