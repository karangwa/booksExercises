//
//	Date Test
//

#include <iostream>
#include "Date.h"

int main ()
{
	int d, m, y;
	std::cout << "Creating first instance of Date\n"
			  << "--------------------------------\n";
	Date date1 (12, 9, 1998);
	
	std::cout << "Displaying date: ";
	date1.displayDate() ; 
	
	//Date with month greater than 12
	std::cout << "\n\n\n\nCreating second instance of Date\n"
			  << "---------------------------------\n";
	Date date2 (29, 13, 2012);
	
	std::cout << "Displaying date: ";
	date2.displayDate() ; 

	std::cout <<"\n\n\nEnter new day for date2: ";
	std::cin >> d;
	date2.setDay ( d );
	
	std::cout << "Enter new month for date2: ";
	std::cin >> m;
	date2.setMonth (m);
	
	std::cout << "Enter new year for date2: ";
	std::cin >>y;
	date2.setYear (y);
	
	std::cout << "\n\nNew date2 values: ";
	date2.displayDate() ;
	std::cout << std::endl << std::endl;
	
	
}