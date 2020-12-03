package com.avijitsamanta.competitiveProgramming.Problem;

import java.util.*;

class Two{
	Random rand = new Random();
	private void display(int [][] arr){
		for (int i=0;i<arr.length ;i++ ) {
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
	}

	private int generateRandom(){
		return rand.nextInt(2);
	}

	private void generateBorder(int [][] arr){
		int c=0;
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=0;j<arr.length ;j++ ) {
				if (arr[i][j]==1) {
					c+=4;

					if (i!=0 && arr[i-1][j]==1) // Up
					c-=2;
					

					if (j!=0 && arr[i][j-1]==1) // Left
						c-=2;
				
				}
			}
		}

		System.out.print(c);
	}

	public static void main(String[] args) {
		int n;
		System.out.print("Enter the limit ");
		Scanner sc=new Scanner(System.in);

		n=sc.nextInt();

		int[][] arr =new int[n][n];
		Two obj=new Two();

		for (int i=0;i<n ;i++ ) 
			for(int j=0;j<n;j++)
				arr[i][j]=obj.generateRandom();

		obj.display(arr);
		obj.generateBorder(arr);
	}
}