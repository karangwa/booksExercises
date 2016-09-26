/****************************************************************************
 *				Modified Compound-Interest Program							*
 *	Program that modifies the compound-interest application of Fig. 5.6 to	*
 * 	repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%.		*
 *																			*
 * 	Java How To Program Deitel 9th Edition Exercise 5.14  					*
 ****************************************************************************/

class ModifiedCompoundInterest
{
	public static void main (String[] args)
	{
		double amount5, amount6, amount7, amount8, amount9, amount10;
		double principal = 1000.0;
		
		System.out.printf( "%s%20s%20s%20s%20s%20s%20s\n", "Year", "Interest: 5%", "Interest: 6%",
						"Interest: 7%","Interest: 8%", "Interest: 9%", "Interest: 10%" );
		
		// calculate amount on deposit for each of ten years
		for ( int year = 1; year <= 10; year++ )
		{
			// calculate new amount for specified year
			amount5 = principal * Math.pow( 1.0 + 0.05, year );
			amount6 = principal * Math.pow( 1.0 + 0.06, year );
			amount7 = principal * Math.pow( 1.0 + 0.07, year );
			amount8 = principal * Math.pow( 1.0 + 0.08, year );
			amount9 = principal * Math.pow( 1.0 + 0.09, year );
			amount10 = principal * Math.pow( 1.0 + 0.1, year );
			// display the year and the amount
			System.out.printf( "%4d%,20.2f%,20.2f%,20.2f%,20.2f%,20.2f%,20.2f\n", year, amount5, amount6, amount7, amount8, amount9, amount10 );
		} 
	}
}