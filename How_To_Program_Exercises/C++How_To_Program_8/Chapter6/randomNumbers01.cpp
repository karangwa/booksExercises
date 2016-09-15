/****************************************
*	Program that assign random integers	*
*	to a variable in given ranges		*
****************************************/
#include <iostream>
#include <cstdlib>
#include <iomanip>

int main()
{
	int n;
	std::srand(time(NULL));

	//1 <= n <= 2
	std::cout << "\n1 <= n <= 2: " << (1 + rand() % 2) << std::endl;

	//1 <= n <= 100
	std::cout << "\n1 <= n <= 100: " << (1 + rand() % 100) << std::endl;

	//0 <= n <= 9
	std::cout << "\n0 <= n <= 9: " << (rand() % 10) << std::endl;

	//1000 <= n <= 1112
	std::cout << "\n1000 <= n <= 1112: " <<  (1000 + rand() % 113) << std::endl;

	//–1 <= n <= 1
	std::cout << "\n-1 <= n <= 1: " <<  (rand() % 3 - 1) << std::endl;

	//–3 <= n <= 11
	std::cout << "\n-3 <= n <= 11: " <<  (rand() % 14 - 3) << std::endl;

}

