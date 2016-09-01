/********************************************************
 *	This program reads three nonzero double values and	*
 *	determines and prints whether they could represent 	*
 *	the sides of a triangle								*
 ********************************************************/
 
 import java.util.Scanner;
 
 public class SidesOfATriangle
 {
	public static void main(String[] args)
	{
		double a, b, c;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter three non-zero double values: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		String str = "The three sides could not represent the sides of a triangle";
	
		if (a + b > c)
		{
			if (a + c > b)
				if (b + c > a)
					str =  "The three sides could represent the sides of a triangle";
		}
		
		System.out.println(str);
	}
 }