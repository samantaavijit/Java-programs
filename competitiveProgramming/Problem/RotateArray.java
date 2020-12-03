package com.avijitsamanta.competitiveProgramming.Problem;

import java.util.*;
/*
5 4 3 2 1   element=2
3 2 1 5 4
*/

class RotateArray {

	int arr[] = new int[10];
	int n, lim;

	private void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array limit out of 10 ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Enter the value of " + (i + 1) + " ");
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the number of rotaded element < " + n + " ");
		lim = sc.nextInt();

		if (lim <= n) {
			display();
			arrayRerv(0, lim - 1);

			arrayRerv(lim, n - 1);

			arrayRerv(0, n - 1);
			System.out.println();
			display();
		}
	}

	private void display() {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private void arrayRerv(int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		RotateArray obj = new RotateArray();
		obj.getInput();
	}
}