/************************************************************************
 *						Averaging Integers								*
 * Program that uses a for statement to calculate the average of		*
 * several integers. Assume the last value read is the sentinel 9999	*
 * C++ How To Program Deitel 8th Edition Exercise 5.6					*
 ***********************************************************************/
 
import java.util.Scanner;
 
class AveragingIntegers
{
	public static void main (String[] args)
	{
		int total, cardinal, n;
		total = n = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integers to average (9999 to end): ");
		
		for (cardinal = 0; ; ++cardinal)
		{
			n = input.nextInt();
			
			if (n != 9999)
				total += n;
			else
				break;
		}
		
		System.out.printf("The average is %.2f\n", (double)total/cardinal);
	}
}