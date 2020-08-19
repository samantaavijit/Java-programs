package com.avijitsamanta.LeedCodeProblems;

import java.util.Scanner;

/**
 * @author Avijit Samanta
 * 
 *         Input: n = 234 Output: 15 Explanation: Product of digits = 2 * 3 * 4
 *         = 24 Sum of digits = 2 + 3 + 4 = 9 Result = 24 - 9 = 15
 *
 */
public class SubtracttheProductandSumofDigitsofanInteger {


	private int solutionUsingChar(int n) {
		char [] arr=Integer.toString(n).toCharArray();
        int mul=1,sum=0;
        for(char c:arr){
            mul*=c- '0';
            sum+=c- '0';
        }
        return mul-sum;
	}
	private int solutionUsingLoop(int n) {
		int sum=0,mul=1;
		while(n!=0) {
			int d=n%10;
			sum+=d;
			mul*=d;
			n/=10;
		}
		return mul-sum;
	}
	
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the Number : ");
	int n=scanner.nextInt();
	
	SubtracttheProductandSumofDigitsofanInteger objDigitsofanInteger = new SubtracttheProductandSumofDigitsofanInteger();
	System.out.println(objDigitsofanInteger.solutionUsingChar(n)+" Using Char");
	System.out.println(objDigitsofanInteger.solutionUsingLoop(n)+" Using Loop");
	
	}

}
