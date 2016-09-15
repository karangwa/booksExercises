/************************************************
 *	Program that decrypts a four digit integer	*
 *	Each digit is encrypted as follows: 		*
 *	digit = (digit + 7) % 10					*
 *	To decrypt:	digit = (digit + 3) % 10		*
 ************************************************/
 
import java.util.Scanner;
 
class Decrypt
{
	public static void main (String[] args)
	{
		int n, first, second, third, fourth, decrypted;
	
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter an encrypted integer: ");
		n = input.nextInt();

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

		System.out.printf("\nDecrypted integer: %d", decrypted);
	}
}