package com.avijitsamanta.Collage;

public class MyException {
    public static void main(String[] args) {
        try {
            float c = 10 / 0;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
