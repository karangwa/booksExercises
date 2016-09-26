/************************************************************************
 *					Factorials											*
 *	Program that uses a for statement to evaluate the factorials of the *
 *	integers from 1 to 5												*
 * 	C++ How To Program Deitel 8th Edition Exercise 5.10					*
 ***********************************************************************/
 
#include <iostream>
#include <iomanip>

int main()
{
	int fact;
	std::cout << std::setw(2) << "\n n" << std::setw(10) << " n!";

	for (int i = 1; i <= 5; ++i)
	{
		fact = 1;

		for (int j = 1; j <= i; ++j)
			fact *= j;

		std::cout << "\n" << std::setw(2) << i
			<< std::setw(10) << fact;
	}


	std::cout << std::endl;
	return 0;
}