/****************************************************************************
 *				Modified Compound-Interest Program							*
 *	Program that modifies the compound-interest application of Fig. 5.6 to	*
 * 	repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%.		*
 *																			*
 * 	Visual C# 2012 How To Program Deitel Exercise 6.14  					*
 ****************************************************************************/


using System; 

class ModifiedCompoundInterest
{
	public static void Main (string[] args)
	{
		decimal amount5, amount6, amount7, amount8, amount9, amount10;
		decimal principal = 1000;
		
		Console.WriteLine("{0, 4}{1, 15}{2, 15}{3, 15}{4, 15}{5, 15}{6, 15}", "Year", "Interest: 5%", "Interest: 6%",
						"Interest: 7%","Interest: 8%", "Interest: 9%", "Interest: 10%" );
		
		// calculate amount on deposit for each of ten years
		for ( int year = 1; year <= 10; year++ )
		{
			// calculate new amount for specified year
			amount5 = principal * ((decimal) Math.Pow( 1.0 + 0.05, year ));
			amount6 = principal * ((decimal) Math.Pow( 1.0 + 0.06, year ));
			amount7 = principal * ((decimal) Math.Pow( 1.0 + 0.07, year ));
			amount8 = principal * ((decimal) Math.Pow( 1.0 + 0.08, year ));
			amount9 = principal * ((decimal) Math.Pow( 1.0 + 0.09, year ));
			amount10 = principal * ((decimal) Math.Pow( 1.0 + 0.1, year ));
			// display the year and the amount
			Console.WriteLine( "{0, 4}{1, 15:C}{2, 15:C}{3, 15:C}{4, 15:C}{5, 15:C}{6, 15:C}",
							 year, amount5, amount6, amount7, amount8, amount9, amount10 );
		}
	}
}