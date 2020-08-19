package com.avijitsamanta.AllPatterns;

import java.util.Scanner;

/*
    *
   ***
  *****
 *******
*********
*/
public class Triangale {

	int i, j, k, a = 1;

	void display(int n) {
		for (i = 1; i <= n; i++) {
			for (j = i; j <= n - 1; j++)
				System.out.print(" ");
			for (k = 1; k <= a; k++)
				System.out.print("*");
			a += 2;
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Triangale obj = new Triangale();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit ");
		obj.display(sc.nextInt());

	}

}
