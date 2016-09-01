/************************************************
 *	Checkboard Pattern of Asterisks				*
 *	Program that displays a checkboard pattern	*
 ***********************************************/
#include <iostream>

int main()
{
	int row = 0,
		column;
	
	while (++row < 8 )
	{
		column = 0;
		
		if ( row % 2 == 0)
			std::cout << ' ';
			
		while (++column < 8)
		{
			std::cout << '*';
			std::cout << ' ';
		}
		
		std::cout << std::endl;
	}
}
