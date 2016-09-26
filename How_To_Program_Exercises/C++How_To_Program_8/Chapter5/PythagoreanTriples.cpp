/********************************************************************************	
 *				Pythagorean Triples												*
 *	Program that finds all integer Pythagorean triples no larger than 500 		*
 *	We use brute force to find the triples										*
 * 	C++ How To Program Deitel 8th Edition Exercise 5.20 						*
 ********************************************************************************/
 
#include <iostream>
#include <iomanip>

int main ()
{	
	//Declare & Initialize variables
	int triplesFound = 0;

	std::cout << std::setw(10) << "Side1" << std::setw(10) 
			<< "Side2" << std::setw(10) << "Side3\n";
	
	//Find Pythagorean triples
	for (int side1 = 1; side1 <= 500; ++side1)
	{
		for(int side2 = 1; side2 <= 500; ++side2)
		{
			for(int side3 = 1; side3 <= 500; ++side3) 
			{
				if ((side3*side3) == ((side2*side2) + (side1*side1)))
				{
					triplesFound++;
					std::cout << std::setw(10) << side1
						<< std::setw(10) << side2
						<< std::setw(10) << side3 << std::endl;
				}
			}
		}		
	}

	std::cout << "\n\nTotal Pythagorean triples found: " << triplesFound << std::endl;
	return 0;
}
 