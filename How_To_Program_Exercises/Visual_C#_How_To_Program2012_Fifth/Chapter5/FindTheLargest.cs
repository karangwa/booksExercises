/********************************
 *	Program to find the Largest	*
 *	number from user input		*		
 ********************************/
 
 using System;
 
 class FindTheLargest
 {
	public static void Main (string[] args)
	{
		int counter = 0, number, largest;
		
		Console.Write("Enter the first number: ");
		number = Convert.ToInt32(Console.ReadLine());
		largest = number;
		
		while (counter++ < 9)
		{
			Console.Write("Enter the next number: ");
			number = Convert.ToInt32(Console.ReadLine());

			if (number > largest)
				largest = number;
		}
		
		Console.WriteLine("\n\nThe largest number is: {0}\n\n", largest);
	}
 }
