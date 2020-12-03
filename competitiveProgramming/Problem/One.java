package com.avijitsamanta.competitiveProgramming.Problem;

import java.util.*;
class One{

	int[] a =new int[10];
	int[] b =new int[10];
	int n;

	private void getInput(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array limit out of 10 ");
		n=sc.nextInt();

		for (int i=0;i<n ;i++ ) {
			System.out.print("Enter the value of " + (i+1)+" ");
			a[i]=sc.nextInt();
		}

	}

	private void display(){
		for (int i=0;i<n ;i++ ) {
			System.out.print(b[i]+" ");
		}
	}

	private void generateMultiplication(){
		int mul;
		for (int i=0;i<n ;i++ ) {
			mul=1;
			for (int j=0;j<n ;j++ ) {
				if (a[i]!=a[j]) {
					mul =mul*a[j];
				}
			}
			b[i]=mul;
		}
	}

	public static void main(String[] args) {
		One obj=new One();
		obj.getInput();
		obj.generateMultiplication();
		obj.display();
		
	}
}