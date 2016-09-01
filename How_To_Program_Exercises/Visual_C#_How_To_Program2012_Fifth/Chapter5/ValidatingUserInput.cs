/****************************************
 *	Analysis of examination results,	* 
 *	using nested control statements.	*
 ***************************************/
 
 using System;
 
 public class ValidatingUserInput
 {
	public static void Main (string [] args)
	{
		//initialize variables in declaration
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result = 0;
		
		while (studentCounter <= 10)
		{
			Console.Write ("Enter result (1 = pass, 2 = fail): ");
			result = Convert.ToInt32 (Console.ReadLine());
			
	
			
			if (result == 1)
				passes = passes + 1;
			else if (result == 2)
				failures = failures + 1;
			else 
			{
				Console.WriteLine("\nInvalid Input\n");
				studentCounter = studentCounter - 1;
			}
				
			studentCounter = studentCounter + 1;
		}
		
		Console.WriteLine("Passed: {0}\nFailed: {1}", passes, failures);
		
		if (passes > 8)
			Console.WriteLine("Bonus to instructor!");
	}
 } 