//
//	Date Class Implementation
//

#include <iostream>
#include "Date.h"

//Constructor
Date::Date (int d, int m, int y)
{
	if ( m < 1 || m > 12)
		month = 1;
	else	
		month = m;
		
	day = d;
	year = y;
}

//Returns current value of month as integer
int Date::getMonth()
{
	return month;
}

//Sets value of month to m
void Date::setMonth (int m)
{
	//Set month to 1 if m is not between 1 and 12
	if ( m < 1 || m > 12 )
		month = 1;
	else	
		month = m;
}

//Returns day as integer
int Date::getDay ()
{
	return day;
}

//Sets day to a new value
void Date::setDay (int d)
{
	day = d;
}

//Function to get year
int Date::getYear()
{
	return year;
}

//Function to set year
void Date::setYear (int y)
{
	year = y;
}

//Function to display the date
void Date::displayDate()
{
	std::cout << day <<'/' 
			  << month << '/'
			  << year << std::endl;
}



