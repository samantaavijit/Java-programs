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
public class RightArrow {

	int i, j, k, a = 0, b;

	void aa(int n) {
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= a; j++)
				System.out.print(" ");
			for (k = i; k <= n; k++)
				System.out.print("*");
			b = a;
			a += 2;
			System.out.print("\n");
		}

		for (i = 2; i <= n; i++) {
			b -= 2;
			for (j = 1; j <= b; j++)
				System.out.print(" ");
			for (k = 1; k <= i; k++)
				System.out.print("*");
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		
		RightArrow obj=new RightArrow();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the limit ");
		int n=sc.nextInt();
		obj.aa(n);

	}

}
