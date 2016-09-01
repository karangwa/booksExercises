/************************************************
 *	Program that reads a nonnegative integer	*  
 * 	and computes and prints its factorial.		*
*************************************************/
#include <iostream>

int main ()
{
	int inputNumber, n;
	int factorial = 1;
	std::cout << "\nEnter a positive integer: ";
	std::cin >> inputNumber;
	
	n = inputNumber;
	
	while ( n > 0)
	{
		factorial = factorial * n;
		n = n - 1;
	}
	
	std::cout << inputNumber << "! is " << factorial << std::endl;

	return 0;
}