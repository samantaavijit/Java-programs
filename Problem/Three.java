import java.util.*;

class Three{
	
	private void display(int []arr){
		for (int i=0;i<arr.length ;i++ ) 
			System.out.print(arr[i]+" ");		
	}

	public static void main(String[] args) {
		int n;
		System.out.print("Enter the limit ");
		Scanner sc=new Scanner(System.in);

		n=sc.nextInt();

		int arr[]=new int[n];
		Three obj=new Three();

		for (int i=0;i<n ;i++ ) 
			arr[i]=sc.nextInt();

		obj.display(arr);
	}
}