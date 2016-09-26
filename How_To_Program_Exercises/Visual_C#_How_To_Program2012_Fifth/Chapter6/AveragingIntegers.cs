/************************************************************************
 *						Averaging Integers								*
 * Program that uses a for statement to calculate the average of		*
 * several integers. Assume the last value read is the sentinel 9999	*
 * C++ How To Program Deitel 8th Edition Exercise 5.6					*
 ***********************************************************************/
 
using System;

class AveragingIntegers
{
	public static void Main (string[] args)
	{
		int total, cardinal, n;
		total = n = 0;
		
		Console.Write("Enter integers to average (9999 to end): ");
		
		string [] input = Console.ReadLine().Split();
		for (cardinal = 0; ; ++cardinal)
		{
			n = Convert.ToInt32(input[cardinal]);
			
			if (n != 9999)
				total += n;
			else
				break;
		}
		
		Console.WriteLine("The average is {0:0.00}", (double)total/cardinal);
	}
}