package com.avijitsamanta.competitiveProgramming.Problem;

import java.util.Scanner;

class PrimeLessThanN{
	
	private boolean isPrime(int n){
		for (int i=2;i<=n/2 ;i++ ) 
			if (n%i==0) 
				return false;
		return true;	
	}

	public static void main(String[] args) {
		int c=0;
		PrimeLessThanN obj=new PrimeLessThanN();
		int n,sum=0;
		System.out.print("Enter the limit ");
		Scanner sc=new Scanner(System.in);

		n=sc.nextInt();

		for (int i=2;i<=n;i++ ) {
			if (obj.isPrime(i)) {
				sum+=i;
				if (obj.isPrime(sum)&&i>2&&sum<=n) {	
					c=+sum;
				}
			}
		}
		System.out.println(c);

	}
}