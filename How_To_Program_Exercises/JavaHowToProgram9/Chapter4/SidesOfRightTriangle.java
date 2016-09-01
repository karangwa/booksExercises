/****************************************************************
 * 	Program that reads three nonzero integers and determines	*
 *	and prints whether they’re the sides of a right triangle.	*
 ****************************************************************/
 
 import java.util.Scanner;
 
 public class SidesOfRightTriangle
 {
	public static void main (String[] args)
	{	
		double a, b, c;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter three non-zero double values: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		String str = "The three sides could not represent the sides of a triangle";
	
		if (a*a + b*b == c*c)
			str =  "The three sides could represent the sides of a triangle";
	
		if (a*a + c*c == b*b)
			str =  "The three sides could represent the sides of a triangle";
			
		if (b*b + c*c == a*a)
			str =  "The three sides could represent the sides of a triangle";
		
		System.out.println(str);
	}
 }