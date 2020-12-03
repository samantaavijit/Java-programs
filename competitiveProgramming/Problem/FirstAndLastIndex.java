package com.avijitsamanta.competitiveProgramming.Problem;

import java.util.*;
class FirstAndLastIndex{

	private void display(int [] arr){
		for (int i=0;i<arr.length ;i++ ) {
			System.out.print(arr[i]+" ");
		}
	}

	private void findPosition(int [] arr,int target){
		int [] result=new int[2];
		result[0]=findFirstPosition(arr,target);
		result[1]=findLastPosition(arr,target);

		System.out.print("\nFirst position is "+result[0]+"\nLast Position is "+result[1]);
	}

	// It only return first position like in our case po=3
	private int findFirstPosition(int [] arr,int target){
		int index=-1;
		int start=0,end=arr.length-1,mid;

		while(start<=end){
			mid=(start+end)/2;

			if (arr[mid]==target) {
				index=mid;
				end=mid-1;
			}
			else if (arr[mid]>target) 
				end=mid-1;
			else 
				start=mid+1;
		}
		return index;
	}
	// It only return last position like in our case po=6
	private int findLastPosition(int [] arr,int target){
		int index=-1;
		int start=0,end=arr.length-1,mid;

		while(start<=end){
			mid=(start+end)/2;

			if (arr[mid]==target) {
				index=mid;
				start=mid+1;
			}
			else if (arr[mid]>target) 
				end=mid-1;
			else 
				start=mid+1;
		}
		return index;
	}
	
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the limit ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the the value ");
		int[] arr =new int[n];
		for (int i=0;i<n ;i++ ) 
			arr[i]=sc.nextInt();

		FirstAndLastIndex obj=new FirstAndLastIndex();
		Arrays.sort(arr);
		obj.display(arr);
		System.out.print("\nEnter the value that you want to find the position ");
		obj.findPosition(arr,sc.nextInt());
	}
}