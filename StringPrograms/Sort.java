package com.avijitsamanta.StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	private String strSort(String s) {
		char[] a =s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String That you want to sort ");
		String string = scanner.nextLine();
		Sort objSort = new Sort();
		System.out.println(objSort.strSort(string));
	}

}
