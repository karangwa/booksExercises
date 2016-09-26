/************************************************************************
 *					Product of Odd Integers								*
 *	Program that uses a for statement to calculate and print the product*
 *	of the odd integers from 1 to 15									*
 *  Java How To Program Deitel 9th Edition Exercise 5.12				*
 ***********************************************************************/
  
 class ProductOfOddIntegers
 {
	public static void main (String[] args)
	{
		int product = 1;
		
		for (int i = 1; i <= 15; i += 2)
			product *= i;
		
		System.out.printf("Product of odd numbers between 1 and 15 is %d", product);
	}
 }