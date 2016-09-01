/************************************************
 *	Checkboard Pattern of Asterisks				*
 *	Program that displays a checkboard pattern	*
 ***********************************************/
 
 using System;
 
 public class CheckboardBoardAsterisks
 {
	public static void Main (string[] args)
	{
		int row = 0, 
			column;
			
		while (++row < 8 )
		{
			column = 0;
			
			if ( row % 2 == 0)
				Console.Write(" ");
			
			while (++column < 8)
				Console.Write("* ");
		
			Console.WriteLine();
		}		
	}
 }