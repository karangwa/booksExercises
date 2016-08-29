//
//	Employee Class Implementation
//

#include <string>
#include "Employee.h"

Employee::Employee (std::string fName, std::string lName, int monthlySal)
{
	firstName = fName;
	lastName = lName;
	
	if (monthlySal > 0)
		monthlySalary = monthlySal;
}

std::string Employee::getFirstName()
{
	return firstName;
}

void Employee::setFirstName (std::string fName)
{
	firstName = fName;
}

std::string Employee::getLastName()
{
	return lastName;
}

void Employee::setLastName (std::string lName)
{
	lastName = lName;
}

int Employee::getMonthlySalary ()
{
	return monthlySalary;
}

void Employee::setMonthlySalary (int salary)
{
	if (salary > 0)
		monthlySalary = salary;
	else
		monthlySalary = 0;
}