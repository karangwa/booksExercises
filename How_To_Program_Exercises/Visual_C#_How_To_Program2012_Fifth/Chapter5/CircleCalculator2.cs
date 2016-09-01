/************************************************
 *	Program that reads radius of a circle as	*	 	
 *	a double value and computes and prints		*
 *	the diameter, the circumference and the 	*
 *	area										*
 ************************************************/
 
 using System;
 
 public class CircleCalculator2
 {
	public static void Main (string[] args)
	{
		double radius;
	
		Console.Write("Enter the radius: ");
		radius = Convert.ToDouble(Console.ReadLine());
		
		Console.WriteLine("\nThe diameter is: {0:0.00}", radius * 2.0);
		Console.WriteLine("\nThe circumference is: {0:0.00}", 2.0 * radius * Math.PI);
		Console.WriteLine("\nThe area is: {0:0.00}", radius * radius * Math.PI);
	}
 }