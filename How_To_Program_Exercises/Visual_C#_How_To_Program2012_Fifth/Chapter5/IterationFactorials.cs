/************************************************
 *	Program that reads a nonnegative integer	*  
 * 	and computes and prints its factorial.		*
 ************************************************/
 
 using System;
 
 class IterationFactorials
{
	public static void Main (string[] args)
	{
		int inputNumber;
		int n;		
		int factorial = 1;
		
		Console.Write("\nEnter a positive integer: ");
		n = inputNumber = Convert.ToInt32(Console.ReadLine());
		
		while ( n > 0)
		{
			factorial = factorial * n;
			n = n - 1;
		}
		
		Console.WriteLine("{0}! is {1}", inputNumber, factorial);
	}
}