/********************************************************************
 *					Summing Integers								*
 * Program that uses a for statement to sum a sequence of integers	*
 * C++ How To Program Deitel 8th Edition Exercise 5.5				*
 *******************************************************************/
 
 import java.util.Scanner;
 
 class SumIntegers
 {
	public static void main (String[] args)
	{
		int n, cardinal, total = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a series of numbers to add (first should specify number of values to be entered): ");
		cardinal = input.nextInt();
		
		for (int i = 0; i < cardinal; ++i)
		{
			n = input.nextInt();
			total += n;
		}
		
		System.out.printf("\nTotal: %d", total);
	}
 }