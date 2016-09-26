/****************************************************************************
 *				Bar Chart													*
 *	Program that read five numbers between 1 and 30 and prints  for each 	*
 *	a line containing that number of adjacent asterisks						*
 * 	Java How To Program 9th Edition Deitel Exercise 5.16  					*
 ****************************************************************************/

import java.util.Scanner;

class BarChart
{
	public static void main (String[] args)
	{
		int n = 0;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter five numbers between 1 and 30: ");
		
		for (int i = 0; i < 5; ++i)
		{
			n = input.nextInt();
			
			for (int j = 0; j < n; ++j)
				System.out.print('*');
			System.out.println();
		}
		System.out.println();
	}
}