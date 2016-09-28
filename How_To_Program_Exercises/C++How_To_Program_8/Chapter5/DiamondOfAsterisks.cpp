/********************************************************************************	
 *				Displaying a Diamond											*
 *	Program prints a diamond shape using the for loop							* 
 *	PS: I complicated the heck out of my solution								*
 * 	C++ How To Program Deitel 8th Edition Exercise 5.23  						*
 ********************************************************************************/
 
#include <iostream>
 
int main()
{
	
	for (int row = 0; row < 9; ++row)
	{
		if (row <= 4)
		{
			for (int col = 0; col < 9; ++col)
				if ((col + row) >= 4 && (col + row) <= (4 + row * 2))
					std::cout << '*';
				else
					std::cout << ' ';
		}
		else
		{
			for (int col = 0; col < 9; ++col)
				if (!((col + row) <= 12 && (col + row) >= (4 + 2 * (row % 4))))
					std::cout << ' ';
				else
				{
					if (row == 8 && (col + row) < 12)
						std::cout << ' ';
					else
						std::cout << '*';
				}
					
		}


		std::cout << '\n';
	}
}
 