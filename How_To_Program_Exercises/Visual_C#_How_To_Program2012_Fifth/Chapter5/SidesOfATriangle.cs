/********************************************************
 *	This program reads three nonzero double values and	*
 *	determines and prints whether they could represent 	*
 *	the sides of a triangle								*
 ********************************************************/
 
 using System;
 
 public class SidesOfATriangle
 {
	public static void Main (string[] args)
	{
		double a, b, c;
		
		Console.Write("Enter three non-zero double values\nEnter the first:  ");
		a = Convert.ToInt32(Console.ReadLine());
		
		Console.Write("\nEnter the second number :  ");
		b = Convert.ToInt32(Console.ReadLine());
		
		Console.Write("\nEnter the third number :  ");
		c = Convert.ToInt32(Console.ReadLine());
		
		string str = "The three sides could not represent the sides of a triangle";
	
		if (a + b > c)
		{
			if (a + c > b)
				if (b + c > a)
					str =  "The three sides could represent the sides of a triangle";
		}
		
		Console.WriteLine(str);
	}
 }