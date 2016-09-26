/************************************************************************
 *					Product of Odd Integers								*
 *	Program that uses a for statement to calculate and print the product*
 *	of the odd integers from 1 to 15									*
 * 	C++ How To Program Deitel 8th Edition Exercise 5.9					*
 ***********************************************************************/

#include <iostream>

int main()
{
	int product = 1;
	
	for (int i = 1; i <= 15; i += 2)
		product *= i;
		
	std::cout << "Product of odd numbers between 1 and 15 is " << product << std::endl;
	
	return 0;
}