package com.avijitsamanta.CoadingChallenges;

import java.util.Scanner;

/**
 * @author Avijit Samanta
 * 
 *         Input --> 11110101010 Output --> false
 * 
 * 
 *         Input --> 11001110001010 Output -->true
 * 
 *         Explanation : Number of 1 = Number of 0
 *
 */
public class BinaryNumberCheck {

	private boolean check(String s) {
		String[] aStrings = s.split("0");
		String[] bStrings = s.split("1");
		
		for(int i=0;i<aStrings.length;i++) {
			if(aStrings[i].length()!=bStrings[i].length())
				return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
	
		BinaryNumberCheck objBinaryNumberCheck = new BinaryNumberCheck();
		System.out.print("Enter the Binary String ");
		Scanner scanner =new Scanner(System.in);
		String string=scanner.nextLine();
		System.err.println(objBinaryNumberCheck.check(string));
	}

}
