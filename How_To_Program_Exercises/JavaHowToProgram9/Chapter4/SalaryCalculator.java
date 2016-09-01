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
import java.util.Scanner;

class SalaryCalculator
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		int hours;
		double rate, salary;
		
		System.out.printf("\nEnter hours worked (-1 to end): ");
		hours = input.nextInt();
		
		while ( hours != -1)
		{	
			System.out.printf("Enter the hourly rate: ");
			rate = input.nextDouble();
			
			if ( hours <= 40 )
				salary = hours * rate;
			else
				salary = (40 * rate) + ((hours-40) * 1.5 * rate);
				
			System.out.printf("Salary is $%.2f", salary);
			
			System.out.printf("\n\n\nEnter hours worked (-1 to end): ");
			hours = input.nextInt();
		}
		
	}
}