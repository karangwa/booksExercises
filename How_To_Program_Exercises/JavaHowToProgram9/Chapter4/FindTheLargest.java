/********************************
 *	Program to find the Largest	*
 *	number from user input		*		
 ********************************/
 
 import java.util.Scanner;
 
 class FindTheLargest
 {
	public static void main (String[] args)
	{
		int counter = 0, number, largest;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the first number: ");
		number = input.nextInt();
		largest = number;
		
		while (counter++ < 9)
		{
			System.out.print("Enter the next number: ");
			number = input.nextInt();
			
			if (number > largest)
				largest = number;
		}
		
		System.out.printf("\n\nThe largest number is %d\n\n", largest);
	}
 }