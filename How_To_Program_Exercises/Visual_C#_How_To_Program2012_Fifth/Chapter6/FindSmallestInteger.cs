/************************************************************************
 *					Find the Smallest Integer							*
 * Program that uses a for statement to find the smallest of several 	*
 * integers. The first value read specifies the number of values 		*
 * remaining.															*
 * Visual C# 2012 How To Program Deitel Exercise 6.11					*
 ***********************************************************************/
 
using System;

class FindSmallestInteger
{
	public static void Main (string[] args)
	{
		int smallest, n, cardinal;
		
		Console.Write("Enter integers (First value should specify the number of values remaining):");
		
		string [] input = Console.ReadLine().Split();
		
		cardinal = Convert.ToInt32(input[0]);
		smallest = Convert.ToInt32(input[1]);
		
		for (int i = 2; i <= cardinal; ++i)
		{
			n = Convert.ToInt32(input[i]);
			
			if ( n < smallest )
				smallest = n;
		}
		
		Console.WriteLine("Smallest number is {0}", smallest);
	}
}