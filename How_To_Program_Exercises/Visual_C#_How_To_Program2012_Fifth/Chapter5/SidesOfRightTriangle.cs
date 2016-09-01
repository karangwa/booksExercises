/****************************************************************
 * 	Program that reads three nonzero integers and determines	*
 *	and prints whether they’re the sides of a right triangle.	*
 ****************************************************************/
 
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
	
		if (a*a + b*b == c*c)
			str =  "The three sides could represent the sides of a triangle";
	
		if (a*a + c*c == b*b)
			str =  "The three sides could represent the sides of a triangle";
			
		if (b*b + c*c == a*a)
			str =  "The three sides could represent the sides of a triangle";
		
		Console.WriteLine(str);
	}
 }