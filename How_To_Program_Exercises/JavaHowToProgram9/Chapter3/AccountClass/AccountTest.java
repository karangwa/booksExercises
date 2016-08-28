//
// Account Test
//

public class AccountTest
{
	public static void main (String[] args)
	{
		System.out.println("\n\n\nCreating first account\n----------------------");
		Account account1 = new Account ( 50.00 );
		System.out.printf("Initial balance: $%.2f\n", account1.getBalance());
		
		System.out.println("\nAdding $300 ...");
		account1.credit(300.00);
		System.out.printf("Balance: $%.2f\n", account1.getBalance());
		
		System.out.println("\nWithdrawing $230 ...");
		account1.debit(230.00);
		System.out.printf("Balance: $%.2f\n", account1.getBalance());
		
		
		System.out.println("\n\nCreating second account with negative initial balance\n-----------------------------------------------------");
		Account account2 = new Account ( -750.00 );
		System.out.printf("Initial balance: $%.2f\n", account2.getBalance());
		
		System.out.println("\nAdding $600 ...");
		account2.credit(600.00);
		System.out.printf("Balance: $%.2f\n", account2.getBalance());
		
		System.out.println("\nAttempting to withdraw $1000 ...");
		account2.debit(1000.00);
		System.out.printf("Balance: $%.2f\n\n\n", account2.getBalance());
	}
}

