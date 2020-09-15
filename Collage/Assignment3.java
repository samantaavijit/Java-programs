package com.avijitsamanta.Collage;

abstract class MyAbstract {
    abstract void add(int a, int b);
}

class A extends MyAbstract {

    @Override
    void add(int a, int b) {
        System.out.println("Addition (abstract) is " + (a + b));
    }
}

interface MyInterface {
    int add(int a, int b);
}

class B implements MyInterface {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        A a = new A();
        a.add(20, 30);
        B b = new B();
        System.out.println("Addition (interface) is " + b.add(100, 185));
    }
}
