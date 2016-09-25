/********************************************************************
 *					Summing Integers								*
 * Program that uses a for statement to sum a sequence of integers	*
 * C++ How To Program Deitel 8th Edition Exercise 5.5				*
 *******************************************************************/
 
using System;

class SummingIntegers
{
	public static void Main(string[] args)
	{
		int n, cardinal, total = 0;
		
		Console.Write("Enter a series of numbers to add (first should specify number of values to be entered): ");
		string [] input = Console.ReadLine().Split();
		
		cardinal = Convert.ToInt32(input[0]);
		
		for (int i = 1; i <= cardinal; ++i)
		{
			n = Convert.ToInt32(input[i]);
			total += n;
		}
		
		Console.WriteLine("\nTotal: {0}", total);
	}
}