/********************************************************************************	
 *				Calculating the value of PI										*
 *	Program that estimates the value of PI using an infinite series				*
 * 	Visual C# 2012 How To Program Deitel Exercise 6.20  						*
 ********************************************************************************/
 
using System;
 
class CalculatingPI
{
	public static void Main (string[] args)
	{
		//Initialize PI
		double PI = 0.0;
		
		//Display Table header
		Console.WriteLine("{0, -10}{1, -10}", "Level", "PI Value");
		
			
		//Calculate PI
		for(int i = 1, j = 1; i <= 500000; i++, j+=2)
		{
			if (i % 2 != 0)
				PI += 4.0 / j;
			else
				PI -= 4.0 / j;

			if ( i % 10000 == 0)
				Console.WriteLine("{0,-10}{1,-10:0.00000000}", i, PI);
		}	
	}
}