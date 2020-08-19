package com.avijitsamanta.DataStructure.Algorithm;

public class BinarySearch {
	private int binarySearch(int[] arr, int item) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == item)
				return mid;
			else if (arr[mid] > item)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9};
		BinarySearch objBinarySearch=new BinarySearch();
		System.out.println(objBinarySearch.binarySearch(arr, 2));
	}

}
