//
//	Invoice class implementation
//


#include <string>
#include "Invoice.h"

//Invoice Constructor
Invoice::Invoice (int p, int q, std::string n, std::string d)
{
	if ( p > 0 )
		price = p;
	else	
		price = 0;
			
	if ( q > 0 )
		quantity = q;
	else	
		quantity = 0;
			
	number = n;
		
	description = d;
}

//Set price
void Invoice::setPrice(int p)
{
	if ( p > 0 )
		price = p;
	else	
		price = 0;
}

int Invoice::getPrice ()
{
	return price;
}

void Invoice::setQuantity (int q)
{
	if ( q > 0 )
		quantity = q;
	else	
		quantity = 0;
}

int Invoice::getQuantity ()
{
	return quantity;
}

void Invoice::setNumber (std::string n)
{
	number = n;
}

std::string Invoice::getNumber ()
{
	return number;
}

void Invoice::setDescription (std::string d)
{
	description = d;
}

std::string Invoice::getDescription ()
{
	return description;
}

int Invoice::getInvoice ()
{
	return quantity * price;
}


















