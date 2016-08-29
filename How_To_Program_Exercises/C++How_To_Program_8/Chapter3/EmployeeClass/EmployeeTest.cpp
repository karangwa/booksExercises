//
//	Employee Test 
//

#include <iostream>
#include <string>
#include "Employee.h"

int main ()
{
	std::cout <<"\nCreating first instance of class Employee\n-------------------------------------------\n";
	Employee bojack("Bojack", "Horseman", 2500);
	
	std::cout <<"First Name: " << bojack.getFirstName()
			  <<"\nLast Name: " << bojack.getLastName()
			  <<"\nMonthly Salary: $" << bojack.getMonthlySalary()
			  <<"\nYearly Salary: $" << bojack.getMonthlySalary() * 12 << '\n';
	
	
	std::cout <<"\nCreating second instance of class Employee\n---------------------------------------------\n";
	Employee morty("Morty", "Smith", 4500);
	
	std::cout <<"First Name: " << morty.getFirstName()
			  <<"\nLast Name: " << morty.getLastName()
			  <<"\nMonthly Salary: $" << morty.getMonthlySalary()
			  <<"\nYearly Salary: $" << morty.getMonthlySalary() * 12 << '\n';
			  
	//Salary Increase
	bojack.setMonthlySalary(bojack.getMonthlySalary() * 110 / 100);
	morty.setMonthlySalary(morty.getMonthlySalary() * 110 / 100);
			  
	std::cout <<"\n\nAfter 10% raise\n------------------\n";
	std::cout <<"Bojack's yearly salary: $" << bojack.getMonthlySalary() * 12
			  <<"\nMorty's yearly salary: $" << morty.getMonthlySalary() * 12
			  <<std::endl;
	
	
}