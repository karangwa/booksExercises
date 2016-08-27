//
//	Account.h
//
#include <iostream>

class Account
{
private:
	int balance;

public:
	Account( int initBalance )
	{
		if (initBalance >= 0)
			balance = initBalance;
		else {
			balance = 0;
			std::cout << "\nError! The initial balance was invalid.\n";
		}
	}

	//Adds amount to balance
	void credit(int amount)
	{
		balance = balance + amount;
	}

	//Withdraws amount from balance
	void debit(int amount)
	{
		if (amount <= balance)
			balance = balance - amount;
		else
			std::cout << "\nDebit amount exceeded account balance.\n";
	}

	int getBalance()
	{
		return balance;
	}
};