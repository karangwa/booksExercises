/****************************************	
 *	Program that computes two largest	*
 *	numbers in a set of 10 input numbers*
 ****************************************/
 
 import java.util.Scanner;
 
 class FindTwoLargest
 {
	public static void main (String[] args)
	{
		int counter = 0; 
		int number;
		int largest;
		int secondLargest = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the first number: ");
		number = input.nextInt();
		largest = number;
		
		while (++counter < 10)
		{
			System.out.print("Enter the next number: ");
			number = input.nextInt();
			
			if (number > largest)
			{
				secondLargest = largest;
				largest = number;
			}
			else if (number > secondLargest)
			{
				secondLargest = number;
			}
		}
		
		System.out.printf("\n\nThe largest number is %d\n", largest);
		System.out.printf("The second largest number is %d", secondLargest);
	}
 }