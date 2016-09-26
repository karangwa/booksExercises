/************************************************************************
 *						Factorials										*
 *	Program that uses a for statement to evaluate the factorials of the *
 *	integers from 1 to 20												*
 * 	Java How To Program Deitel 8th Edition Exercise 5.13				*
 ***********************************************************************/

class Factorials513
{
	public static void main (String[] args)
	{
		long fact;
		System.out.printf("\n%3s%15s", "n", "n!");
		
		for (int i = 1; i <= 20; ++i)
		{
			fact = 1;

			for (int j = 1; j <= i; ++j)
				fact *= (long)j;

			System.out.printf("\n%3d%15d", i, fact);
		}
		
		System.out.println();
	}
}




