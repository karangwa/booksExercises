/********************************************************************************	
 *				Displaying a Diamond											*
 *	Program prints a diamond shape using the for loop							* 
 *	PS: I complicated the heck out of my solution								*
 * 	Visual C# 2012 How To Program Deitel Exercise 6.23  						*
 ********************************************************************************/
 
using System;
 
class DisplayingDiamonds
{
	public static void Main (string [] args)
	{
		for(int row1 = 1; row1 <= 5; ++row1)
		{
			int n = 5 - row1;
			for (int space = n; space > 0; --space)
				Console.Write(' ');
				
			for (int asterisk1 = 0; asterisk1 < row1; ++asterisk1)
				Console.Write('*');
				
			for (int asterisk2 = 0; asterisk2 < row1 - 1; ++asterisk2)
				Console.Write('*');
				
			Console.WriteLine();
		}
		
		for (int row2 = 1; row2 <= 5; ++row2)
		{
			int n = 5 - row2;
			
			for (int space = 0; space < row2; ++space)
				Console.Write(' ');
				
			for (int asterisk1 = n; asterisk1 > 0; --asterisk1)
				Console.Write('*');
				
			for (int asterisk2 = n; asterisk2 > 1; --asterisk2)
				Console.Write('*');
				
			Console.WriteLine();
		}
	}
}