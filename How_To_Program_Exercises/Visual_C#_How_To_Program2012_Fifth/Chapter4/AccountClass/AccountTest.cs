using System; 
public class AccountTest
{
	public static void Main (string[] args)
	{
		//Creating the first account acct1
		Console.WriteLine("\n\nFirst account\n-------------");
		Account acct1 = new Account(500.00M);
		Console.WriteLine("Initial Balance: {0:C}", acct1.Balance);
		
		//Adding and withdrawing from acct1
		Console.WriteLine("\nAdding $300 ...");
		acct1.Credit ( 300.00M );
		Console.WriteLine("Balance: {0:C}", acct1.Balance);
		
		Console.WriteLine("\nWithdrawing $230 ...");
		acct1.Debit(230.00M);
		Console.WriteLine("Balance: {0:C}", acct1.Balance);
		
		
		
		//Create the second account 
		Console.WriteLine("\n\nSecond account\n--------------");
		Account acct2 = new Account(-754.00M);
		Console.WriteLine("Initial Balance: {0:C}", acct2.Balance);
		
		Console.WriteLine("\nAdding $450 ...");
		acct2.Credit ( 450.00M );
		Console.WriteLine("Balance: {0:C}", acct2.Balance);
		
		//Trying to withdraw amount > balance
		Console.WriteLine("\nTrying to withdraw $1000 ...");
		acct2.Debit ( 1000.00M );
		Console.WriteLine("Balance: {0:C}", acct2.Balance);
				
	}
}