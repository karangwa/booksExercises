/****************************************	
 *	Program that computes two largest	*
 *	numbers in a set of 10 input numbers*
 ****************************************/

#include <iostream>

int main()
{
	int counter = 0; 
	int number;
	int largest;
	int secondLargest = 0;

	std::cout << "Enter the first number: ";
	std::cin >> number;
	largest = number;

	while (counter++ < 9)
	{
		std::cout << "Enter the next number: ";
		std::cin >> number;

		if (number > largest)
		{
			secondLargest = largest;
			largest = number;
		}
		else if (number > secondLargest)
		{
			secondLargest = number;
		}
	}

	std::cout << "\n\nThe largest number is " << largest
		<< "\nThe second largest number is " << secondLargest
		<< std::endl << std::endl;
}
