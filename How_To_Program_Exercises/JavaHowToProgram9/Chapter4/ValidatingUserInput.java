/****************************************
 *	Analysis of examination results,	* 
 *	using nested control statements.	*
 ***************************************/
 
 import java.util.Scanner;
 
 public class ValidatingUserInput
 {
	public static void main (String[] args)
	{
		//initialize variables in declaration
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result = 0;
		
		Scanner input = new Scanner (System.in);
		
		while (studentCounter <= 10)
		{
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			
			result = input.nextInt();
			
			if (result == 1)
				passes = passes + 1;
			else if (result == 2)
				failures = failures + 1;
			else 
			{
				System.out.print("\nInvalid Input\n");
				studentCounter = studentCounter - 1;
			}
				
			studentCounter = studentCounter + 1;
		}
		
		System.out.printf("Passed: %d\nFailed: %d\n\n", passes, failures);
		
		if (passes > 8)
			System.out.println("Bonus to instructor!");
	}
 }