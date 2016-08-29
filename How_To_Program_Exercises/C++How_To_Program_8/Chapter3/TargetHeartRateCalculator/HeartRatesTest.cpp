//
//	HeartRates Class Implementation
//

#include <iostream>
#include <string>
#include "HeartRates.h"

int main()
{
	std::string fName, lName;
	int bDay, bMonth, bYear;

	std::cout << "Enter your first and last names: ";
	std::cin >> fName >> lName;

	std::cout << "Enter your birth day, month and year: ";
	std::cin >> bDay >> bMonth >> bYear;

	HeartRates heartRate(fName, lName, bDay, bMonth, bYear);

	heartRate.getAge();

	std::cout << "Your information "
		<< "\n-----------------"
		<< "\nFirst Name: " << heartRate.getFirstName()
		<< "\nLast Name: " << heartRate.getLastName()
		<< "\nMaximum Heart Rate: " << heartRate.getMaximumHeartRate()
		<< "\nTarget Heart Rate: " << heartRate.getTargetHeartRate()
		<< std::endl << std::endl;
}