/************************************************************************
 *					Product of Odd Integers								*
 *	Program that uses a for statement to calculate and print the product*
 *	of the odd integers from 1 to 15									*
 *  Visual C# 2012 How To Program Deitel  Exercise 6.12					*
 ***********************************************************************/
 
using System;

class ProductOfOddIntegers
{
	public static void Main (string[] args)
	{
		int product = 1;
		
		for (int i = 1; i <= 15; i += 2)
			product *= i;
		
		Console.WriteLine("\nProduct of odd numbers between 1 and 15 is {0}", product);
	}
} 
 
