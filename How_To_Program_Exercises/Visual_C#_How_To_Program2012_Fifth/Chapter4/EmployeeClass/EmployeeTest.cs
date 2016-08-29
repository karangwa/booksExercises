//
//	Employee Test Class
//
using System;

class EmployeeTest
{
	public static void Main (string[] args)
	{
		Console.WriteLine("\nCreating first instance of class Employee\n-------------------------------------------\n");
		Employee bojack = new Employee ("Bojack", "Horseman", 2500.00M);
		
		Console.WriteLine("First Name: {0}\nLast Name: {1}\nMonthly Salary: {2:C}\nYearly Salary: {3:C}\n",
						  bojack.FirstName, bojack.LastName, bojack.MonthlySalary, bojack.MonthlySalary * 12);
		
		Console.WriteLine("\n\n\nCreating second instance of class Employee\n---------------------------------------------\n");
		Employee morty = new Employee ("Morty", "Smith", 4000.00M);
		
		Console.WriteLine("First Name: {0}\nLast Name: {1}\nMonthly Salary: {2:C}\nYearly Salary: {3:C}\n",
						  morty.FirstName, morty.LastName, morty.MonthlySalary, morty.MonthlySalary * 12);
	
		//Salary Increase
		morty.MonthlySalary = morty.MonthlySalary * (decimal)1.1;
		bojack.MonthlySalary = bojack.MonthlySalary * (decimal)1.1;
		
		Console.WriteLine("\n\nAfter 10% raise\n-----------------\n");
		Console.WriteLine("Bojack's yearly salary: {0:C}\nMorty's yearly salary {1:C}\n",
						  bojack.MonthlySalary * 12, morty.MonthlySalary * 12);
	
	}
}