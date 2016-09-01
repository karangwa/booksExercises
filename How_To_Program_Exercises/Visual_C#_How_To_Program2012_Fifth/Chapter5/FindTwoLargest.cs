/****************************************	
 *	Program that computes two largest	*
 *	numbers in a set of 10 input numbers*
 ****************************************/
 
 using System;
 
 class FindTwoLargest
 {
	public static void Main (string[] args)
	{
		int counter = 0; 
		int number;
		int largest;
		int secondLargest = 0;
		
		Console.Write("Enter the first number: ");
		number = Convert.ToInt32(Console.ReadLine());
		largest = number;
		
		while (++counter < 10)
		{
			Console.Write("Enter the next number: ");
			number = Convert.ToInt32(Console.ReadLine());
			
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
		
		Console.WriteLine("\n\nThe largest number is {0}", largest);
		Console.WriteLine("The second largest number is {0}", secondLargest);
	}
 }