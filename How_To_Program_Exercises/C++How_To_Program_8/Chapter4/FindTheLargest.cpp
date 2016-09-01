/********************************
 *	Program to find the Largest	*
 *	number from user input		*		
 ********************************/
#include <iostream>

int main()
{
	int counter = 0, number, largest;

	std::cout << "Enter the first number: ";
	std::cin >> number;
	largest = number;

	while (counter++ < 9)
	{
		std::cout << "Enter the next number: ";
		std::cin >> number;

		if (number > largest)
			largest = number;
	}

	std::cout << "\n\nThe largest number is: " << largest << std::endl << std::endl;
}

