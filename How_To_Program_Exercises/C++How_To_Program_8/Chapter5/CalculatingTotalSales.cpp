/********************************************************************************	
 *				Calculating Total Sales											*
 *	A mail order house sells five different products whose retail prices are: 	*
 *	product 1 — $2.98, product 2—$4.50, product 3—$9.98, product 4—$4.49 and 	*
 *	product 5— $6.87. The program reads a series of pairs of numbers as follows:*
 * 	a) product number															*
 *	b) quantity sold															*
 * and determines the retail price for each product								*
 * 	C++ How To Program Deitel 8th Edition Exercise 5.14  						*
 ********************************************************************************/
 
#include <iostream>
#include <iomanip>

int main()
{
	//Initialize variables
	int productNum;	//product number	
	int quantitySold;	//quantity sold
	double totalSales = 0.0;	//total retail price 
	
	//Enter product number and quantity sold
	std::cout << "Enter the product number and the quantity sold (-1 to end):";
	std::cin >> productNum;
	
	//Enter the rest of the data
	while (productNum != -1)
	{
		std::cin >> quantitySold;

		//Calculate current total sales
		switch (productNum)
		{
		case 1:
			totalSales += quantitySold * 2.98;
			break;
		case 2:
			totalSales += quantitySold * 4.50;
			break;
		case 3:
			totalSales += quantitySold * 9.98;
			break;
		case 4:
			totalSales += quantitySold * 4.49;
			break;
		case 5:
			totalSales += quantitySold * 6.87;
			break;
		default:
			//Error message
			std::cout << "The product number you entered is invalid. Please try again.\n";
			break;	
		}
		//Enter product number and quantity sold
		std::cout << "Enter the product number and the quantity sold (-1 to end):";
		std::cin >> productNum;
		
	}

	//Display total sales
	std::cout << std::setiosflags(std::ios::fixed | std::ios::showpoint)
		<< "\n\nTotal sales: " << std::setprecision(2) << totalSales << std::endl;

	return 0;
}
