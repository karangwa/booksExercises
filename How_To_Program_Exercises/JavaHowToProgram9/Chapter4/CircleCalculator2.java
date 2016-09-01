/************************************************
 *	Program that reads radius of a circle as	*	 	
 *	a double value and computes and prints		*
 *	the diameter, the circumference and the 	*
 *	area										*
 ************************************************/
 
 import java.util.Scanner;
 
 public class CircleCalculator2
 {
	public static void main (String[] args)
	{
		double radius;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		
		System.out.printf("\nThe diameter is: %.2f", radius * 2.0);
		System.out.printf("\nThe circumference is: %.2f", 2.0 * radius * Math.PI);
		System.out.printf("\nThe area is: %.2f", radius * radius * Math.PI);
	}
 }