//
// Employee Class
//
using System;

class Employee
{
	private string firstName;
	private string lastName;
	private decimal monthlySalary;
	
	public Employee (string fName, string lName, decimal monthlySal)
	{
		FirstName = fName;
		LastName = lName;
		MonthlySalary = monthlySal;
	}
	
	public string FirstName
	{
		get { return firstName; }
		set { firstName = value; }
	}
	
	public string LastName
	{
		get { return lastName; }
		set { lastName = value; }
	}
	
	public decimal MonthlySalary
	{
		get { return monthlySalary; }
		set
		{
			if ( value >= (decimal)0.0 )
				monthlySalary = value;
		}
	}
	
}