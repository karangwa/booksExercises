//
//	HeartRates Class Test
//

#include <iostream>
#include <string>
#include "HeartRates.h"

//Constructor
HeartRates::HeartRates (std::string fName, std::string lName, int d, int m, int y)
{
	firstName = fName;
	lastName = lName;
	birthDay = d;
	birthMonth = m;
	birthYear = y;
}

//Function that sets firstName
void HeartRates::setFirstName(std::string fName)
{
	firstName = fName;
}

//Function that returns firstName
std::string HeartRates::getFirstName()
{
	return firstName;
}

//Function that sets Last Name
void HeartRates::setLastName(std::string lName)
{
	lastName = lName;
}

//Function that returns Last Name
std::string HeartRates::getLastName()
{
	return lastName;
}

//Function that sets the Birthday
void HeartRates::setBirthDay(int d, int m, int y)
{
	birthDay = d;
	birthMonth = m;
	birthYear = y;
}

//Function that returns Age
int HeartRates::getAge()
{
	int dd, mm, yy;
	std::cout << "Enter todays date in the following format d m y: ";
	std::cin >> dd >> mm >> yy;

	age = yy - birthYear;

	//If current date is before birthday, decrement age 
	if (birthMonth > mm)
		age = age - 1;

	if (birthMonth == mm)
		if (birthDay > dd)
			age = age - 1;

	return age;
}

//Function that returns Maximum Heart Rate
int HeartRates::getMaximumHeartRate()
{ 
	return 220 - age;
}

//Function that returns Target Heart Rate
int HeartRates::getTargetHeartRate()
{
	return getMaximumHeartRate() * 675 / 1000;
}