/************************************************	
 * Program that reads in the size of the side	*
 * square then prints a hollow square of that	*
 * size out of asterisks and blanks				*
 ***********************************************/
 
 #include <iostream>
 
 int main ()
 {
	int side, row, column;
	
	std::cout << "Enter the size of the side: ";
	std::cin >> side;
	
	row = side; 
	while (row > 0)
	{
		column = side;
		
		while ( column > 0 )
		{
			if (row == side || row == 1 || column == side || column == 1)
				std::cout << '*';
			else	
				std::cout << ' ';
			
			column = column - 1;
		}
		std::cout << '\n';
		row = row - 1;
	}
 }
