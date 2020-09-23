package com.avijitsamanta.AllPatterns;

import java.util.Scanner;

/**
 	*****
   ****
  ***
 **
*
 **
  ***
   ****
    *****
 
 *
 */
public class LeftArrow {

	int i, j, k;

	void aa(final int n) {
		for (i = 1; i <= n; i++) {
			for (j = i; j < n; j++)
				System.out.print(" ");
			for (k = i; k <= n; k++)
				System.out.print("*");
			System.out.print("\n");
		}

		for (i = 2; i <= n; i++) {
			for (j = 1; j <= i - 1; j++)
				System.out.print(" ");
			for (k = 1; k <= i; k++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

	public static void main(final String[] args) {
		LeftArrow obj = new LeftArrow();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the llimit ");
		final int n = sc.nextInt();
		obj.aa(n);

	}

}
