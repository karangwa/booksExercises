/********************************************************************************	
 *				Displaying a Diamond											*
 *	Program prints a diamond shape using the for loop							*  
 *	The number of rows is determined by the user								*
 * 	PS: User input is not validated												*	
 * 	C++ How To Program Deitel 8th Edition Exercise 5.24  						*
 ********************************************************************************/

 #include <iostream>
 
int main()
{
	int halfRows; 
		
	std::cout << "Enter an odd number between 1 and 19: ";
	std::cin >> halfRows;
	halfRows = (halfRows + 1 ) / 2;
	
		for(int row1 = 1; row1 <= halfRows; ++row1)
		{
			int n = halfRows - row1;
			for (int space = n; space > 0; --space)
				std::cout << ' ';
				
			for (int asterisk1 = 0; asterisk1 < row1; ++asterisk1)
				std::cout << '*';
				
			for (int asterisk2 = 0; asterisk2 < row1 - 1; ++asterisk2)
				std::cout << '*';
				
			std::cout << '\n';
		}
		
		for (int row2 = 1; row2 <= halfRows; ++row2)
		{
			int n = halfRows - row2;
			
			for (int space = 0; space < row2; ++space)
				std::cout << ' ';
				
			for (int asterisk1 = n; asterisk1 > 0; --asterisk1)
				std::cout << '*';
				
			for (int asterisk2 = n; asterisk2 > 1; --asterisk2)
				std::cout << '*';
				
			std::cout << '\n';
		}	
}
 