//
//	InvoiceTest: Tests the Invoice class
//

#include <iostream>
#include <string>
#include "Invoice.h"

int main ()
{
	std::cout << "Creating first invoice\n-----------------------\n";
	Invoice invoice1 (40, 4, "12123", "Flaming Star");
	invoice1.setDescription("The Flaming Star");
	std::cout << "\nItem description: " << invoice1.getDescription()
			  << "Item number: " << invoice1.getNumber() 
			  << "\nItem price: " << invoice1.getPrice()
			  << "\nItem quantity: " << invoice1.getQuantity()
			  << "\nInvoice total: " << invoice1.getInvoice() 
			  << std::endl;
	
	std::cout << "\n\n\nCreating second invoice\n-------------------------\n";
	Invoice invoice2 (25, 11, "44344", "Element of Surprise");
	std::cout << "\nItem description: " << invoice2.getDescription()
		<< "Item number: " << invoice2.getNumber() 
		<< "\nItem price: " << invoice2.getPrice()
		<< "\nItem quantity: " << invoice2.getQuantity()
		<< "\nInvoice total: " << invoice2.getInvoice()
		<< std::endl;
	
	
	std::cout << "\n\n\nCreating third invoice\n-----------------------\n";
	Invoice invoice3 (-12, -1, "24994", "Ready to operate");

	std::cout << "\nItem description: " << invoice3.getDescription() 
		<< "Item number: " << invoice3.getNumber()
		<< "\nItem price: " << invoice3.getPrice()
		<< "\nItem quantity: " << invoice3.getQuantity()
		<< "\nInvoice total: " << invoice3.getInvoice()
		<< std::endl;

	invoice3.setPrice(120);
	invoice3.setQuantity(2);
	std::cout << "\n\nAfter setting correct quantity and price for invoice3:\n";
	std::cout << "\nItem description: " << invoice3.getDescription()
		<< "Item number: " << invoice3.getNumber()
		<< "\nItem price: " << invoice3.getPrice()
		<< "\nItem quantity: " << invoice3.getQuantity()
		<< "\nInvoice total: " << invoice3.getInvoice()
		<< std::endl;

}
