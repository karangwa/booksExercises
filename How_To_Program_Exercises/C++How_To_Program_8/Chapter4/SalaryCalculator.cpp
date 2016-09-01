/********************************************	
*	Salary Calculator						*
*	Program that determines the gross 		*
*	pay for a group of employees			*
*	If the hours worked are 40 or below:	*
*		salary = hours * rate				*
*	If the hours worked are more than 40	*
*		Salary is "time-and-a-half for all	*
*		hours worked in excess of 40 hours	*
*********************************************/

#include <iostream>
#include <iomanip>

int main()
{
	int hours;
	double rate, salary;
	std::cout << "Enter hours worked (-1 to end): "
			  << std::setiosflags(std::ios::fixed | std::ios::showpoint);
	std::cin >> hours;
	
	while ( hours != -1 )
	{
		std::cout << "Enter hourly rate of the worker ($00.00): ";
		std::cin >> rate;
		
		if ( hours <= 40 )
			salary = hours * rate;
		else
			salary = (40 * rate) + ((hours-40) * 1.5 * rate);
			
		std::cout<<"Salary is $" << std::setprecision (2) << salary;
		
		std::cout << "\n\nEnter hours worked (-1 to end): ";
		std::cin >> hours;
	}
	
	return 0;
}