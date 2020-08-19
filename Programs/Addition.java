package com.avijitsamanta.Programs;

import java.util.Scanner;

public class Addition {
    
    private void add(int a, int b) {
		System.out.println(a + b + " Using + sign");
	}

	private void addUseXOR(int a, int b) {

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the two Numbers ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		Addition addition = new Addition();
		addition.add(a, b);
		addition.addUseXOR(a, b);
    }
}