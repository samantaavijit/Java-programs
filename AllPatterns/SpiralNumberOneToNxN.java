/**
 * 
 */
package com.avijitsamanta.AllPatterns;

/**
 * @author Avijit Samanta
 * 
 * 
 *         Input -->5 Output -->
 * 
 *         1 2 3 4 5 16 17 18 19 6 15 24 25 20 7 14 23 22 21 8 13 12 11 10 6
 */
public class SpiralNumberOneToNxN {

	private void generateSpiralMatrix(int n) {
		int[][] arr = new int[n][n];
		int count = 0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				arr[i][j] = ++count;

		displaySpiralMatrix(arr);
	}

	private void displaySpiralMatrix(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		int iRow = 0, iCol = 0;

		while (iRow < row && iCol < col) {
			for (int i = iRow; i < row; i++)  // Right
				System.out.print(arr[iRow][i] + " ");
			iRow++;
			System.out.println();    
		
			for (int i = iRow; i < col; i++)   // Down
				System.out.print(arr[i][col-1] + " ");
			iCol++;
			System.out.println();
			
			for(int i=col-iCol-1;i>=0;i--)
				System.out.print(arr[row-1][i]+" ");
			
			System.out.println();
		}

	}

	public static void main(String[] args) {

		SpiralNumberOneToNxN obj = new SpiralNumberOneToNxN();
		int[][] arr = {
				{1,2,3,4,5},
				{16,17,18,19,6},
				{15,24,25,20,7},
				{14,23,22,21,8},
				{13,12,11,10,9}
				};
		obj.generateSpiralMatrix(5);
		obj.displaySpiralMatrix(arr);
	}

}
