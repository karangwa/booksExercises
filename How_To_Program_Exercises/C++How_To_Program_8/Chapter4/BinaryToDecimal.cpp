/****************************************
 *	Binary To Decimal 					*
 *	Program that inputs a binary number	*
 *	and outputs its decimal equivalent 	*
 ***************************************/

#include <iostream>

int main()
{
	int n,
		binNum, 
		decNum = 0,
		twoMultiple = 1;	
	
	std::cout << "Enter a binary number: ";
	std::cin >> n;
	
	binNum = n;
	
	while ( binNum != 0)
	{
		decNum += (binNum % 10) * twoMultiple;
		binNum = binNum / 10;
		twoMultiple = twoMultiple * 2;
	}
	
	std::cout << "\n\nThe decimal equivalent of " << n 
			  << " is " << decNum << std::endl << std::endl;
}
 
 