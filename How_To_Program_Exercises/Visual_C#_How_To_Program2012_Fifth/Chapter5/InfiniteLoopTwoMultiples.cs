/****************************************************************	
 * 	This program prints multiples of 2 with an Infinite Loop	*
 ***************************************************************/
 
 using System;
 
 public class InfiniteLoopTwoMultiples
 {
	public static void Main (string [] args)
	{
		int n = 1;
		while (true)	//Infinite Loop
		{
			Console.WriteLine(n);
			n *= 2; 	 
		}
	}
 }