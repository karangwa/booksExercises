/********************************************************************************	
 *				Displaying a Diamond											*
 *	Program prints a diamond shape using the for loop							* 
 *	The number of rows is determined by the user								*
 * 	PS: User input is not validated												*								
 * 	Visual C# 2012 How To Program Deitel Exercise 6.24  						*
 ********************************************************************************/
 
using System;
 
class DisplayingDiamondsUserDetermined
{
	public static void Main (string [] args)
	{
		int halfRows; 
		
		Console.Write("Enter an odd number between 1 and 19: ");
		halfRows = (Convert.ToInt32(Console.ReadLine()) + 1 ) / 2;
		
		for(int row1 = 1; row1 <= halfRows; ++row1)
		{
			int n = halfRows - row1;
			for (int space = n; space > 0; --space)
				Console.Write(' ');
				
			for (int asterisk1 = 0; asterisk1 < row1; ++asterisk1)
				Console.Write('*');
				
			for (int asterisk2 = 0; asterisk2 < row1 - 1; ++asterisk2)
				Console.Write('*');
				
			Console.WriteLine();
		}
		
		for (int row2 = 1; row2 <= halfRows; ++row2)
		{
			int n = halfRows - row2;
			
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