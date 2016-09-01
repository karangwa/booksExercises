/************************************************
 *	Program that reads radius of a circle as	*	 	
 *	a double value and computes and prints		*
 *	the diameter, the circumference and the 	*
 *	area										*
 ************************************************/

#include <iostream>

int main()
{
	double radius;
	std::cout << "Enter the radius: ";
	std::cin >> radius;

	std::cout << "The diameter is " << radius * 2
			  << "\nThe Circumference is " << 2 * radius * 3.14159
			  << "\nThe area is " << radius * radius * 3.14159
			  << std::endl;
 
 }
