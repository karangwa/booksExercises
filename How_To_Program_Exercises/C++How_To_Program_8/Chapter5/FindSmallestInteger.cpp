/************************************************************************
 *					Find the Smallest Integer							*
 * Program that uses a for statement to find the smallest of several 	*
 * integers. The first value read specifies the number of values 		*
 * remaining.															*
 * C++ How To Program Deitel 8th Edition Exercise 5.8					*
 ***********************************************************************/
 
#include <iostream>
 
int main()
{
	int smallest, n, cardinal;
	
	std::cout << "Enter integers (First value should specify the number of values remaining): ";
	std::cin >> cardinal;

	std::cin >> smallest;
	
	for (int i = 1; i < cardinal; ++i)
	{
		std::cin >> n;
		
		if ( n < smallest )
			smallest = n;
	}
	
	std::cout << "Smallest number is " << smallest << std::endl;
} 