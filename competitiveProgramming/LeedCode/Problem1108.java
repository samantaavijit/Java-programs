/**
 * 
 */
package com.avijitsamanta.competitiveProgramming.LeedCode;

import java.util.Scanner;

/**
 * @author Avijit Samanta
 * 
 *         Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1"
 *
 */
public class Problem1108 {

	private String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the IP address : ");
		Problem1108 obj = new Problem1108();
		System.out.println(obj.defangIPaddr(scanner.nextLine()));
	}

}
