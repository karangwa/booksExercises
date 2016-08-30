//
//	Gas Mileage Program
//	Inputs miles driven and gallons used
//	Calculates miles per gallons 
//

#include <iostream>

int main()
{
	int miles, gallons, totalMiles, totalGallons, milesPerGallons;
	totalGallons = totalMiles = 0;
	
	//Prompt miles driven and gallons used
	std::cout << "Enter miles driven (-1 to quit): ";
	std::cin >> miles;
	
	while ( miles != -1)
	{
		std::cout << "Enter gallons used: ";
		std::cin >> gallons;
		
		//Print miles/gallons
		std::cout <<"Miles per gallons for this trip: " 
				  << (double)miles/gallons << std::endl;
				  
		totalGallons += gallons;	
		totalMiles += miles;
		
		std::cout << "\n\n\nEnter miles driven (-1 to quit): ";
		std::cin >> miles;	
	}
	
	std::cout << "\n\n\nTotal miles per gallons for all trips: "
			  << (double)totalMiles/totalGallons << std::endl << std::endl;
}