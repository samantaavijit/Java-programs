package com.avijitsamanta.Collage;

import java.util.Scanner;

class Parent {
    void print() {
        System.out.println("In Parent Class");
    }
}

class Sub1 extends Parent {
    void print() {
        System.out.println("In Sub1 Class");
    }
}

class Sub2 extends Parent {
    void print() {
        System.out.println("In Sub2 Class");
    }
}

class XYZ {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        System.out.print("Enter three numbers ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//       Compile time polymorphism
        XYZ xyz = new XYZ();
        System.out.println("Addition of two numbers " + xyz.add(a, b));
        System.out.println("Addition of three numbers " + xyz.add(a, b, c));

//        Run Time polymorphism

        Parent parent;
        parent = new Sub1();
        parent.print();

        parent = new Sub2();
        parent.print();
    }
}
