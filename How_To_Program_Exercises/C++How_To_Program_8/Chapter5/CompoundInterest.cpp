/****************************************************************************
 *				Modified Compound-Interest Program							*
 *	Program that modifies the compound-interest application of Fig. 5.4 to	*
 * 	repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%.		*
 *																			*
 * 	C++ How To Program Deitel 8th Edition Exercise 5.11  					*
 ****************************************************************************/

#include <iostream>
#include <iomanip>
#include <cmath>

int main()
{
	double amount5, amount6, amount7, amount8, amount9, amount10;
	double principal = 1000.0; 
	
	std::cout << std::fixed << std::setprecision(2)
		<< std::setw(4) << "Year" << std::setw(15) << "Interest: 5%"
		<< std::setw(15) << "Interest: 6%" << std::setw(15) << "Interest: 7%"
		<< std::setw(15) << "Interest: 8%" << std::setw(15) << "Interest: 9%"
		<< std::setw(15) << "Interest: 10%\n";
			  
	// calculate amount on deposit for each of ten years
	for ( int year = 1; year <= 10; year++ )
	{
		// calculate new amount for specified year
		amount5 = principal * pow( 1.0 + 0.05, year );
		amount6 = principal * pow( 1.0 + 0.06, year );
		amount7 = principal * pow( 1.0 + 0.07, year );
		amount8 = principal * pow( 1.0 + 0.08, year );
		amount9 = principal * pow( 1.0 + 0.09, year );
		amount10 = principal * pow( 1.0 + 0.1, year );
		// display the year and the amount
		std::cout << std::setw (4) << year << std::setw(15) << amount5
			  << std::setw(15) << amount6 << std::setw(15) << amount7
			  << std::setw(15) << amount8 << std::setw(15) << amount9
			  << std::setw(15) << amount10 << "\n";
	}
}