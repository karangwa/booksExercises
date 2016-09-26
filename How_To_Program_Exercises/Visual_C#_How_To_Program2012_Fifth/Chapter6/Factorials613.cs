/************************************************************************
 *						Factorials										*
 *	Program that uses a for statement to evaluate the factorials of the *
 *	integers from 1 to 20												*
 * 	Visual C# How To Program Deitel Exercise 6.13						*
 ***********************************************************************/
using System;

class Factorials613
{
	public static void Main (string[] args)
	{
		long fact;
		Console.WriteLine("\n{0, 3}{1, 10}", "n", "n!"); 
		
		for (int i = 1; i <= 5; ++i)
		{
			fact = 1;

			for (int j = 1; j <= i; ++j)
				fact *= (long)j;

			Console.WriteLine("\n{0, 3}{1, 10}", i, fact); 
		}
		Console.WriteLine();
	}
} 