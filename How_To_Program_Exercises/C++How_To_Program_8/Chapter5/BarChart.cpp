/****************************************************************************
 *				Bar Chart													*
 *	Program that read five numbers between 1 and 30 and prints  for each 	*
 *	a line containing that number of adjacent asterisks						*
 * 	C++ How To Program Deitel 8th Edition Exercise 5.13  					*
 ****************************************************************************/

#include <iostream>

int main()
{
	int n = 0;
	std::cout << "Enter five numbers between 1 and 30: ";

	for ( int i = 0; i < 5; ++i)
	{
		std::cin >> n;
		
		for ( int j = 0; j < n; ++j)
			std::cout << '*';
		std::cout << '\n';
	}
	std::cout << std::endl;
	return 0;
}