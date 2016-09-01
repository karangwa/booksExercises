/****************************************
 *	Binary To Decimal 					*
 *	Program that inputs a binary number	*
 *	and outputs its decimal equivalent 	*
 ***************************************/
 
 using System;
 
 public class BinaryToDecimal
 {
	public static void Main (string[] args)
	{
		int n,
			binNum, 
			decNum = 0,
			twoMultiple = 1;
			
		Console.Write("Enter a binary number: ");
		n = binNum = Convert.ToInt32(Console.ReadLine());
		
		while ( binNum != 0)
		{
			decNum += (binNum % 10) * twoMultiple;
			binNum = binNum / 10;
			twoMultiple = twoMultiple * 2;
		}
		
		Console.WriteLine("\n\nThe decimal equivalent of {0} is {1}\n\n", n, decNum);
	}
 }