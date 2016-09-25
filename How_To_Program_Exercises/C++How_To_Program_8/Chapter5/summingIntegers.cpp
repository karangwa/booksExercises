/********************************************************************
 *					Summing Integers								*
 * Program that uses a for statement to sum a sequence of integers	*
 * C++ How To Program Deitel 8th Edition Exercise 5.5				*
 *******************************************************************/
 
#include <iostream>

int main()
{
	int total, input, cardinal;
	total = 0;
	
	std::cout<<"Enter a series of numbers to add (first should specify number of values to be entered): ";
	std::cin>>cardinal;
	
	for (int i = 0; i < cardinal; ++i)
	{
		std::cin>>input;
		total += input;
	}
	
	std::cout << "\nTotal: " << total << std::endl;
	return 0;
}