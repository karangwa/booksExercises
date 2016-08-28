//
//	Account Class Definition
//
using System;
public class Account
{
	private decimal balance;	
	
	//constructor
	public Account (decimal initialBalance)
	{
		Balance = initialBalance;
	}
	
	//Credit an amount to the account
	public void Credit (decimal amount)
	{
		Balance = Balance + amount;
	}
	
	//Method added. 
	public void Debit (decimal amount)
	{
		if ( amount <= Balance)
			Balance = amount;
		else {
			Console.WriteLine("Debit amount exceeded account balance.");
		}
	}
	
	//a property to get and set the account balance
	public decimal Balance
	{
		get { return balance; }
		set {
			//validate value before assigning it to balance
			if (value >= 0)
				balance = value;
		}
	}
}