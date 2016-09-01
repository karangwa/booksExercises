/************************************************
 * Program reads in a five-digit integer and	*
 * determines whether it's a palindrome			*
 ***********************************************/
 using System;
 
 public class Palindromes
 {
	public static void Main (string[] args)
	{
		int number, digit1, digit2, digit4, digit5; 
		
		Console.Write("Enter a five-digit integer: ");
		number = Convert.ToInt32(Console.ReadLine());
		
		digit1 = number / 10000;
		digit2 = (number % 10000 ) / 1000;
		digit4 = (number / 10) % 10;
		digit5 = number % 10;
		
		if ( digit1 == digit5 && digit2 == digit4 )
			Console.WriteLine("{0} is a palindrome.\n", number);
		else	
			Console.WriteLine("{0} is not a palindrome.\n\n", number);
	}
 }