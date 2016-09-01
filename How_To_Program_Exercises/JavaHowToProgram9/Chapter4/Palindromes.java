/************************************************
 * Program reads in a five-digit integer and	*
 * determines whether it's a palindrome			*
 ***********************************************/
 
 import java.util.Scanner;
 
 public class Palindromes
 {
	public static void main (String[] args)
	{
		int number, digit1, digit2, digit4, digit5; 
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a five-digit integer: ");
		number = input.nextInt();
		
		digit1 = number / 10000;
		digit2 = (number % 10000 ) / 1000;
		digit4 = (number / 10) % 10;
		digit5 = number % 10;
		
		if ( digit1 == digit5 && digit2 == digit4 )
			System.out.printf("%d is a palindrome.\n\n", number);
		else	
			System.out.printf("%d is not a palindrome.\n\n", number);
	}
 }