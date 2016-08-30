//
//	HealthProfile Class Test
//

#include <iostream>
#include <string>
#include "HealthProfile.h"

int main()
{
	std::string fName, lName, gender;
	int height, weight;
	int birthDay, birthMonth, birthYear;

	//Prompt first name, last name and gender
	std::cout << "Enter your first name and last name: ";
	std::cin >> fName >> lName;

	std::cout << "Enter your gender: ";
	std::cin >> gender;

	std::cout << "Enter your height (in inches) and weight (in pounds): ";
	std::cin >> height >> weight;

	std::cout << "Enter your date of birth in this format d m y: ";
	std::cin >> birthDay >> birthMonth >> birthYear;

	//Create an instance of HealthProfile
	HealthProfile profile(fName, lName, gender, birthDay, birthMonth, birthYear, height, weight);

	//Set the age data member
	profile.setAge();

	std::cout << "\n\nYour information: "
		<< "\n------------------"
		<< "\nName: " << profile.getFirstName()
		<< " " << profile.getLastName()
		<< "\nAge: " << profile.getAge()
		<< "\nGender: " << profile.getGender()
		<< "\nHeight: " << profile.getHeight() << " inches"
		<< "\nWeight: " << profile.getWeight() << " lbs"
		<< "\nMaximum Heart Rate: " << profile.getMaxHeartRate()
		<< "\nTarget Heart Rate: " << profile.getTargetHeartRate()
		<< "\nBMI: " << profile.getBMI();

	std::cout << "\n\nBMI Values"
		<< "\nUnderweight: less than 18.5"
		<< "\nNormal: between 18.5 and 24.9"
		<< "\nOverweight: between 25 and 29.9"
		<< "\nObese: 30 or greater"
		<< std::endl << std::endl;


	
}