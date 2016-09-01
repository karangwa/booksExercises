/********************************************************
*	Credit Limits										*
*	Program that will determine whether a department-	*
*	store customer has exceeded the credit limit on a	*
*	charge account										*
*********************************************************/

import java.util.Scanner;

class CreditLimits
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		int accountNumber, balance, totalCharges, totalCredits, creditLimit;
		
		System.out.print("\n\nEnter account number (or -1 to quit):  ");
		accountNumber = input.nextInt();
		
		while ( accountNumber != -1 )
		{
			System.out.print("Enter the beginning balance: ");
			balance = input.nextInt();
			
			System.out.print("Enter total charges: ");
			totalCharges = input.nextInt();
			
			System.out.print("Enter total credits: ");
			totalCredits = input.nextInt();
			
			System.out.print("Enter credit limit: ");
			creditLimit = input.nextInt();
			
			balance += totalCharges - totalCredits;
			
			System.out.printf("New balance is %d\n", balance);

			if (balance > creditLimit)
			{
				System.out.printf ("Account: %d\n", accountNumber);
				System.out.printf ("Credit limit: %d\n", creditLimit);
				System.out.printf ("Balance: %d\n", balance);
				System.out.printf ("Credit Limit Exceeded.\n\n");
			}
			
			System.out.print("\n\nEnter account number (or -1 to quit):  ");
			accountNumber = input.nextInt();
		}
	}
}