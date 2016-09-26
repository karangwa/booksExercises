/********************************************************************************	
 *				Title															*
 *	Program prints a diamond shape using the for loop							* 
 * 	C++ How To Program Deitel 8th Edition Exercise 5.23  						*
 ********************************************************************************/
 
#include <iostream>
 
int main()
{
	for (int row = 0; row < 9; ++row)
	{
		for (int col = 0; col < 9; ++col)
			std::cout << '*';

		std::cout << '\n';
	}
}
/*
5.23 (Diamond of Asterisks) Write a program that prints the following diamond shape. You may
use output statements that print a single asterisk (*), a single blank or a single newline. Maximize
your use of repetition (with nested for statements) and minimize the number of output statements.
*/