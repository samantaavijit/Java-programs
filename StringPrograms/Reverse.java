package com.avijitsamanta.StringPrograms;

import java.util.Scanner;

public class Reverse {
	private String strRev(String s) {
		StringBuilder revString = new StringBuilder();
		for (char a : s.toCharArray())
			revString.insert(0, a);
		return revString.toString();
	}

	private String recRev(String s) {
		if (s == null || s.length() == 0)
			return s;
		return recRev(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Reverse objReverse = new Reverse();
		System.out.println("Enter the string that you want to reverse ");
		String string = scanner.nextLine();
		System.out.println("using For each loop " + objReverse.strRev(string));
		System.out.println("using Recursion " + objReverse.recRev(string));


	}

}
