package com.avijitsamanta.Collage;

public class UserDefinedException {
    public static int add(int a, int b) throws Exception {
        if (b < 0)
            throw new Exception("2nd argument always > 0");
        return a + b;
    }

    public static void main(String[] args)  {
        try {
            System.out.println(add(100,10));
            System.out.println(add(100,-10));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
