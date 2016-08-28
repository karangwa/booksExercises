//
//	Invoice Class: Represents an invoice for an item sold at the store
//	
//
#include <string>

class Invoice
{
private:
	int price;			//Item unit price
	int quantity;		//Item's quantity
	std::string number;		//Item invoice number
	std::string description;	//Item's description
	
public:	

	Invoice (int, int, std::string, std::string);
	
	void setPrice (int);				 
	
	int getPrice();						 
	
	void setQuantity (int);				 
	
	int getQuantity ();					 
	
	void setNumber (std::string);
	
	std::string getNumber ();
	
	void setDescription (std::string);
	
	std::string getDescription ();
	
	int getInvoice ();
	
};
