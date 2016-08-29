//
//	Employee Class
//

class Employee
{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee ( String fName, String lName, double monthlySal)
	{
		firstName = fName;
		lastName = lName;
		
		if ( monthlySal >= 0.0 )
			monthlySalary = monthlySal;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName (String fName)
	{
		firstName = fName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName (String lName)
	{
		lastName = lName;
	}
	
	public double getMonthlySalary ()
	{
		return monthlySalary;
	}
	
	public void setMonthlySalary (double monthlySal)
	{
		if ( monthlySal > 0)
			monthlySalary = monthlySal;
	}
}