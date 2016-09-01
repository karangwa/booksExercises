/********************************************************
*	Credit Limits										*
*	Program that will determine whether a department-	*
*	store customer has exceeded the credit limit on a	*
*	charge account										*
*********************************************************/

#include <iostream>
#include <iomanip>

int main()
{
	int accountNumber;
	double balance, totalCharges, totalCredits, creditLimit;

	std::cout << "\nEnter account number (or -1 to quit): "
		<< std::setiosflags(std::ios::fixed | std::ios::showpoint);
	std::cin >> accountNumber;

	while (accountNumber != -1)
	{
		std::cout << "Enter beginning balance: ";
		std::cin >> balance;

		std::cout << "Enter total charges: ";
		std::cin >> totalCharges;

		std::cout << "Enter total credits: ";
		std::cin >> totalCredits;

		std::cout << "Enter credit limit: ";
		std::cin >> creditLimit;

		balance += totalCharges - totalCredits;

		std::cout << "New balance is " << balance << std::endl;

		if (balance > creditLimit)
		{
			std::cout << "Account: " << accountNumber
				<< "\nCredit limit: " << std::setprecision (2) << creditLimit
				<< "\nBalance: " << std::setprecision (2) << balance
				<< "\nCredit Limit Exceeded.\n\n";

		}

		std::cout << "\nEnter account number (or -1 to quit): ";
		std::cin >> accountNumber;
	}
}