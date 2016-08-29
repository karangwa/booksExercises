//
//	HeartRates Class
//	Calculates Maximum and Target Heart Rates
//

using System;
class HeartRates
{
	private string firstName;
	private string lastName;
	private int birthYear;
	private int currentYear;
	
	public HeartRates ( string fName, string lName, int bYear, int currYear)
	{
		FirstName = fName;
		LastName = lName;
		BirthYear = bYear;
		CurrentYear = currYear;
	}
	
	public string FirstName 
	{
		get { return firstName; }
		set { firstName = value; }
	}
	public string LastName 
	{
		get { return lastName; }
		set { lastName = value;}
	}
	
	public int BirthYear
	{
		get { return birthYear; }
		set 
		{
			if ( value > 1900)
				if (value < 2016)
					birthYear = value;
			
		}
	}
	
	public int CurrentYear 
	{
		get { return currentYear; }
		set
		{
				currentYear = value;
		}
	}
	
	public int Age 
	{
		get { return CurrentYear - BirthYear; }
	}
	
	public int MaximumHeartRate
	{
		get { return 220 - Age; }
	}
	
	public int TargetHeartRate
	{
		get { return MaximumHeartRate * 675 / 1000; }
	}
}