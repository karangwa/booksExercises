/************************************************	
 * Program that reads in the size of the side	*
 * square then prints a hollow square of that	*
 * size out of asterisks and blanks				*
 ***********************************************/
 
 using System;
 
 public class SquareOfAsterisks
 {
	public static void Main (string[] args)
	{
		int side, row, column;
		
		Console.Write ("Enter the size of the side: ");
		side = Convert.ToInt32 (Console.ReadLine());
		
		row = side;
		
		while (row > 0)
		{
			column = side;
		
			while ( column > 0 )
			{
				if (row == side || row == 1 || column == side || column == 1)
					Console.Write('*');
				else	
					Console.Write(' ');
			
				column = column - 1;
			}
			Console.Write('\n');
			row = row - 1;
		}
	}
 }