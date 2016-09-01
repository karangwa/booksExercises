/********************************************************
*	Sales Commission Calculator 						*
*	App that inputs one salesperson's items	sold,		*
*	then calculates and displays that person's earnings	*
*	Salary = 200 * sales * 9 / 100						*
*********************************************************/

#include <iostream>
#include <iomanip>

int main()
{
	double sales = 0, salary;


	std::cout << "\nEnter sales in dollars (-1 to end):  "
			  << std::setiosflags(std::ios::fixed | std::ios::showpoint);
	std::cin >> sales;

	while (sales != -1.0)
	{
		salary = 200 + sales * 9 / 100;

		std::cout << "Salary is $" << std::setprecision(2) << salary;

		std::cout << "\nEnter sales in dollars (-1 to end):  ";
		std::cin >> sales;
	}
	 

	return 0;
}