//
//	Account Test : Tests the class Account
//

#include <iostream>
#include "Account.h"

int main()
{
	//Normal account, initial balance = 400
	std::cout << "\n First Object acct1\n--------------------\n";
	
	Account acct1 ( 400 );	//Creating acct1
	std::cout << "Balance after initialization: " << acct1.getBalance() << '\n';
	
	acct1.credit( 300 );	//Add 300, balance = 700
	std::cout << "Added 300, new balance: " << acct1.getBalance() << '\n';
	
	acct1.debit (120);		//Withdraw 120, balance = 580
	std::cout << "Withdrew 120, new balance: " << acct1.getBalance() << std::endl;
	

	//Account acct2, created with negative initial balance
	std::cout <<"\n\n\n\n\n Second Object acct2 \n---------------------\n";
	
	std::cout << "Trying to initialize acct2 with -100 ...";
	Account acct2 (-100);
	std::cout <<"Balance after initialization: " << acct2.getBalance() << '\n';
	
	std::cout << "\n\nAdding 2300 ... " << '\n';
	acct2.credit (2300);
	std::cout << "New balance: " << acct2.getBalance() << '\n';
	
	std::cout << "\n\nTrying to debit 5000 ...";
	acct2.debit (5000);
	std::cout << "Balance: " << acct2.getBalance() << std::endl;
	
}