/************************************************************************
 *					Find the Smallest Integer							*
 * Program that uses a for statement to find the smallest of several 	*
 * integers. The first value read specifies the number of values 		*
 * remaining.															*
 * Java How To Program Deitel 9th Edition Exercise 5.11					*
 ***********************************************************************/
 
import java.util.Scanner;

class FindSmallestInteger
{
	public static void main (String[] args)
	{
		int smallest, n, cardinal;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter integers (First value should specify the number of values remaining):");

		cardinal = input.nextInt();
		smallest = input.nextInt();
		
		for (int i = 1; i < cardinal; ++i)
		{
			n = input.nextInt();
			
			if ( n < smallest )
				smallest = n;
		}
		
		System.out.printf("Smallest number is %d\n", smallest);
	}
}