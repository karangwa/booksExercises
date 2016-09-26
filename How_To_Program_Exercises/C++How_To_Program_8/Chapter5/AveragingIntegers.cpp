/************************************************************************
 *						Averaging Integers								*
 * Program that uses a for statement to calculate the average of		*
 * several integers. Assume the last value read is the sentinel 9999	*
 * C++ How To Program Deitel 8th Edition Exercise 5.6					*
 ***********************************************************************/
 
#include <iostream>
 
int main ()
{
	int total, cardinal, n;

	total = n = 0;

	std::cout << "Enter integers to average (9999 to end): ";

	for (cardinal = 0; ; ++cardinal)
	{
		std::cin >> n;
		
		if (n != 9999)
			total += n;
		else
			break;
	}

	std::cout << "The average is " << static_cast<double>(total) / cardinal << std::endl;

	return 0;
}