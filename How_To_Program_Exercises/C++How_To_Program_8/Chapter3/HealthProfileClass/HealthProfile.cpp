//
//	HealthProfile Class Implementation
//

#include <iostream>
#include <string>
#include "HealthProfile.h"

HealthProfile::HealthProfile( std::string fName, std::string lName, std::string g, int d, int m, int y, int h, int w)
{
	firstName = fName;
	lastName = lName;
	gender = g;
	dayOfBirth = d;
	monthOfBirth = m;
	yearOfBirth = y;
	height = h;
	weight = w;
}

std::string HealthProfile::getFirstName()
{
	return firstName;
}


void HealthProfile::setFirstName(std::string fName)
{
	firstName = fName;
}

//Set and get functions for lastName
std::string HealthProfile::getLastName()
{
	return lastName;
}

void HealthProfile::setLastName(std::string lName)
{
	lastName = lName;
}

//Functions to set and get Gender
std::string HealthProfile::getGender()
{
	return gender;
}

void HealthProfile::setGender(std::string g)
{
	gender = g;
}

//height set and get functions
int HealthProfile::getHeight()
{
	return height;
}

void HealthProfile::setHeight(int h)
{
	height = h;
}

//weight get and set functions
int HealthProfile::getWeight()
{
	return weight;
}

void HealthProfile::setWeight(int w)
{
	weight = w;
}

//age get and set methods
int HealthProfile::getAge()
{
	return age;
}

void HealthProfile::setAge()
{
	int mm, dd, yy;
	std::cout << "\nEnter today's date in format d m y: ";
	std::cin >> dd >> mm >> yy;

	age = yy - yearOfBirth;

	if (monthOfBirth > mm)
		age--;

	if (monthOfBirth == mm)
		if (dayOfBirth > dd)
			age--;
}

//Get Maximum Heart Rate
int HealthProfile::getMaxHeartRate()
{
	return 220 - age;
}

//Get Target Heart Rate
int HealthProfile::getTargetHeartRate()
{
	return getMaxHeartRate() * 675 / 1000;
}

//Get BMI
int HealthProfile::getBMI()
{
	return (weight * 703) / (height * height);
}