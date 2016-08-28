//
//	Account Class
//

public class Account
{
	private double balance;
	
	public Account (double initialBalance)
	{
		//validate initialBalance
		if ( initialBalance > 0.0 )
		{
			balance = initialBalance;
		}
	}
	
	public void credit (double amount)
	{
		balance = balance + amount;
	}
	
	public void debit (double amount)
	{
		if  (amount >= balance)
			balance = balance - amount;
		else {
			System.out.println("Debit amount exceeded account balance.");
		}
			
		
	}
	
	public double getBalance()
	{
		return balance;
	}
}