import java.util.*;
import java.lang.Math;
class Four{
	
	private void display(int []arr){
		for (int i=0;i<arr.length ;i++ ) 
			System.out.print(arr[i]+" ");		
	}

	private void squareArray(int [] arr){
		int maxElement=arr.length-1,index=arr.length-1,i=0;
		int [] result=new int[arr.length];

		while(i<arr.length){

			if (Math.abs(arr[i])>arr[maxElement]) {
				result[index]=arr[i]*arr[i];
			}
			else {
				result[index]=arr[maxElement]*arr[maxElement];
				maxElement--;
			}

			index--;
			i++;
		}


		display(result);
	}

	public static void main(String[] args) {
		int n;
		System.out.print("Enter the limit ");
		Scanner sc=new Scanner(System.in);

		n=sc.nextInt();

		int arr[]=new int[n];
		Four obj=new Four();

		for (int i=0;i<n ;i++ ) 
			arr[i]=sc.nextInt();

		obj.display(arr);
		obj.squareArray(arr);
	}
}