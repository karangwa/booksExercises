/************************************************
 *	Program that decrypts a four digit integer	*
 *	Each digit is encrypted as follows: 		*
 *	digit = (digit + 7) % 10					*
 *	To decrypt:	digit = (digit + 3) % 10		*
 ************************************************/
 
 using System;
 
 class Decrypt
 {
	public static void Main (string[] args)
	{
		int n, first, second, third, fourth, decrypted;
		
		Console.Write("Enter an encrypted integer: ");
		n = Convert.ToInt32(Console.ReadLine());

		//Get separate digits
		first = n / 1000;
		second = (n % 1000) / 100;
		third = ((n % 1000) % 100) / 10;
		fourth = n % 10;

		//Encrypt each digit
		first = (first + 3) % 10;
		second = (second + 3) % 10;
		third = (third + 3) % 10;
		fourth = (fourth + 3) % 10;
		 

		//Get encrypted integer
		decrypted = (first * 1000) + (second * 100) + (third * 10) + fourth;

		Console.WriteLine("\nDecrypted integer: {0}\n", decrypted);
	}
 }