/************************************************
 *	Program that encrypts a four digit integer	*
 *	Each digit is encrypted as follows: 		*
 *	digit = (digit + 7) % 10					*
 *	To decrypt:	digit = (digit + 3) % 10		*
 ************************************************/
 
import java.util.Scanner;

class Encrypt
{
	public static void main (String[] args)
	{
		int n, first, second, third, fourth, encrypted;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter an encrypted integer: ");
		n = input.nextInt();
		
		//Get separate digits
		first = n / 1000;
		second = (n % 1000) / 100;
		third = ((n % 1000) % 100) / 10;
		fourth = n % 10;
		 

		//Encrypt each digit
		first = (first + 7) % 10;
		second = (second + 7) % 10;
		third = (third + 7) % 10;
		fourth = (fourth + 7) % 10;
		
		//Get encrypted integer
		encrypted = (first * 1000) + (second * 100) + (third * 10) + fourth;

		System.out.printf("\nEncrypted integer: %d", encrypted);
	}
}