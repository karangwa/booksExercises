/************************************************
 *	Program that reads a non-negative integer	*  
 * 	and computes and prints its factorial.		*
*************************************************/

import java.util.Scanner;

class IterationFactorials
{
	public static void main (String[] args)
	{
		int inputNumber;
		int n;		
		int factorial = 1;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("\nEnter a positive integer: ");
		inputNumber = input.nextInt();
		
		n = inputNumber;
		
		while ( n > 0)
		{
			factorial = factorial * n;
			n = n - 1;
		}
		
		System.out.printf("%d! is %d", inputNumber, factorial);
	}
}