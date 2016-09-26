/********************************************************************************	
 *				Calculating the value of PI										*
 *	Program that estimates the value of PI using an infinite series				*
 * 	C++ How To Program Deitel 8th Edition Exercise 5.19  						*
 ********************************************************************************/
 
#include <iostream>
#include <iomanip>

int main()
{
	//Initialize PI
	double PI = 0.0;
	//Display table header
	std::cout << std::setw(10) << std::left <<"Level" 
		<< std::setw(10) << std::left << "PI Value\n";
	
	//Calculate PI
	for(int i = 1, j = 1; i <= 500000; i++, j+=2)
	{
		if (i % 2 != 0)
			PI += 4.0 / j;
		else
			PI -= 4.0 / j;

		if ( i % 1000 == 0)
			std::cout << std::setw(10) << i << std::setw(10) 
				<< std::left << std::setprecision (10) << PI << std::endl;
	}

	std::cout << std::endl;
	return 0;
} 

 
 
 
