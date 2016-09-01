/********************************************************
*	Credit Limits										*
*	Program that will determine whether a department-	*
*	store customer has exceeded the credit limit on a	*
*	charge account										*
*********************************************************/

using System;

class CreditLimits
{
	public static void Main (string[] args)
	{
		int accountNumber, balance, totalCharges, totalCredits, creditLimit;
		
		Console.Write("\n\nEnter account number (or -1 to quit):  ");
		accountNumber = Convert.ToInt32(Console.ReadLine());
		
		while ( accountNumber != -1 )
		{
			Console.Write("Enter the beginning balance: ");
			balance = Convert.ToInt32(Console.ReadLine());
			
			Console.Write("Enter total charges: ");
			totalCharges = Convert.ToInt32(Console.ReadLine());
			
			Console.Write("Enter total credits: ");
			totalCredits = Convert.ToInt32(Console.ReadLine());
			
			Console.Write("Enter credit limit: ");
			creditLimit = Convert.ToInt32(Console.ReadLine());
			
			balance += totalCharges - totalCredits;
			
			Console.WriteLine("New balance is {0}", balance);
			
			if (balance > creditLimit)
			{
				Console.WriteLine ("Account: {0}", accountNumber);
				Console.WriteLine ("Credit limit: {0}", creditLimit);
				Console.WriteLine ("Balance: {0}", balance);
				Console.WriteLine ("Credit Limit Exceeded.\n\n");
			}
			
			Console.Write("\n\nEnter account number (or -1 to quit):  ");
			accountNumber = Convert.ToInt32(Console.ReadLine());
		}
	}
}