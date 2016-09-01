/********************************************	
*	Salary Calculator						*
*	Program that determines the gross 		*
*	pay for a group of employees			*
*	If the hours worked are 40 or below:	*
*		salary = hours * rate				*
*	If the hours worked are more than 40	*
*		Salary is "time-and-a-half for all	*
*		hours worked in excess of 40 hours	*
*********************************************/

using System;

class SalaryCalculator
{
	public static void Main (string[] args)
	{
		int hours, counter = 0;
		double rate, salary;
		
		while ( counter++ < 3)
		{
			Console.Write("\n\n\nEnter hours worked by employee {0}: ", counter);
			hours = Convert.ToInt32(Console.ReadLine());
			
			Console.Write("Enter the hourly rate: ");
			rate = Convert.ToDouble(Console.ReadLine());
			
			if ( hours <= 40 )
				salary = hours * rate;
			else
				salary = (40.0 * rate) + ((hours-40.0) * 1.5 * rate);
				
			Console.WriteLine("Salary is {0:0.00}", salary);
		}
	}
}