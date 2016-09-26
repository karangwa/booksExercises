/****************************************************************************
 *				Bar Chart													*
 *	Program that read five numbers between 1 and 30 and prints  for each 	*
 *	a line containing that number of adjacent asterisks						*
 * 	Visual C# 2012 How To Program Deitel Exercise 6.16  					*
 ****************************************************************************/

 using System;
 class BarChart
 {
	public static void Main (string[] args)
	{
		int n = 0;
		Console.Write("Enter five numbers between 1 and 30: ");
		
		string [] input = Console.ReadLine().Split();
		
		for ( int i = 0; i < 5; ++i )
		{	
			n = Convert.ToInt32( input[i] );
			
			for ( int j = 0; j < n; ++j )
				Console.Write('*');
			Console.WriteLine();
		}	
		Console.WriteLine();
	}
 }