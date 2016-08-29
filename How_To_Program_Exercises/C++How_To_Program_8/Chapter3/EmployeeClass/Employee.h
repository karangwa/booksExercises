//
//	Employee Header Class
//
#include <string>

class Employee
{
private:
	std::string firstName;
	std::string lastName;
	int monthlySalary;
	
public:
	Employee (std::string, std::string, int);
	std::string getFirstName();
	void setFirstName( std::string );
	
	std::string getLastName();
	void setLastName (std::string);
	
	int getMonthlySalary();
	void setMonthlySalary (int);
};