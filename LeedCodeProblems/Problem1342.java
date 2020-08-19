/**
 * 
 */
package com.avijitsamanta.LeedCodeProblems;

import java.util.Scanner;

/**
 * @author Avijit Samanta
 * 
 *         Input: num = 14 Output: 6 Explanation: Step 1) 14 is even; divide by
 *         2 and obtain 7. Step 2) 7 is odd; subtract 1 and obtain 6. Step 3) 6
 *         is even; divide by 2 and obtain 3. Step 4) 3 is odd; subtract 1 and
 *         obtain 2. Step 5) 2 is even; divide by 2 and obtain 1. Step 6) 1 is
 *         odd; subtract 1 and obtain 0.
 *
 */
public class Problem1342 {

	private int numberOfSteps (int num) {
        int count=0;
        while(num!=0){
            num=num%2==0?num/2:num-1;
            ++count;
        }
        return count;
    }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		Problem1342 objProblem1342=new Problem1342();
		System.out.println(objProblem1342.numberOfSteps(scanner.nextInt()));

	}

}
