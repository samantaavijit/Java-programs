package avijitsamanta; 

public class AvijitArray {
	// Array Addition
	public int arrayAdd(int [] array){
		int s=0;
		for(int i=0;i<array.length;i++)
			s=s+array[i];
		return s;
	}
	// Array Multiplication
	public int arrayMul(int [] array){
		int mul=1;
		for (int i=0;i<array.length ;i++ ) 
			mul=mul*array[i];
		return mul;
	}
	// Array Reverse with out position  12345 >> 54321
	public int[] arrayReverse(int [] array){
		int temp,start=0;
		int end=(array.length) - 1;
		while(start<end){
			temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
		return array;
	}
	// Array Reverse with position  12345,1,3 >>> 14325
	public int[] arrayReveWithPosition(int [] array,int start,int end){
		int temp;
		while(start<end){
			temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
		return array;
	}
	// Maximum number of an Array
	public int arrayMax(int [] array){
		int max=array[0];
		for(int i=1;i<array.length;i++)
			if(max<array[i])
				max=array[i];
		return max;
	}
	// Minimum number of an array
	public int arrayMin(int [] array){
		int min=array[0];
		for (int i=1;i<array.length;i++ ) {
			if (min>array[i]) {
				min=array[i];
			}
		}
		return min;
	}
	// Find First and last position of a perticular element in an array
	// 1235555678,5 >>> first po=3, last po=6
	public int [] FirstAndLastIndex(int [] arr,int target){
		int [] result=new int[2];
		result[0]=findFirstPosition(arr,target);
		result[1]=findLastPosition(arr,target);

		return result;
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
}