//
//	Computerization of Health Records Exercise
// This class stores a person's health information: BMI and Heart Rates
//
using System;

class HealthProfile
{
	private string firstName;
	private string lastName;
	private string gender;
	
	//Date of birth attributes
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	
	private int age;
	
	private int height;			//In inches
	private int weight;			//In pounds	
	
	//Constructor
	public HealthProfile ( string fName, string lName, string g, int d, int m, int y, int h, int w)
	{
		FirstName = fName;
		LastName = lName;
		Gender = g;
		dayOfBirth = d;
		monthOfBirth = m;
		yearOfBirth = y;
		Height = h;
		Weight = w;
	}
	
	
	//Properties
	public string FirstName 
	{
		get { return firstName; }
		set { firstName = value;}
	}
	
	public string LastName
	{
		get { return lastName; }
		set { lastName = value; }
	}
	
	public string Gender
	{
		get { return gender; }
		set { gender = value; }
	}
	
	public int Age
	{
		get { return age; }
	}
	
	public void setAge ()
	{
		int dd, mm, yy;
		//Prompt current date
		Console.Write("Enter the current day: ");
		dd = Convert.ToInt32(Console.ReadLine());
		
		Console.Write("Enter the current month: ");
		mm = Convert.ToInt32(Console.ReadLine());
		
		Console.Write("Enter the current year: ");
		yy = Convert.ToInt32(Console.ReadLine());
		
		age = yy - yearOfBirth;
		
		if ( monthOfBirth > mm )
			age--;
			
		if ( monthOfBirth == mm )
			if ( dayOfBirth > dd )
				age--;
	}
	
	public int Height
	{
		get { return height; }
		set { height = value; }
	}
	
	public int Weight
	{
		get { return weight; }
		set { weight = value; }
	}

	//Calculate and return max heart rate
	public int getMaxHeartRate()
	{
		return 220 - Age;
	}
	
	//Calculates and return the Target Heart Rate
	public int getTargetHeartRate()
	{
		//The target heart rate is between 50% and 85% of the max heart rate
		return getMaxHeartRate() * 675 / 1000;
	}
	
	//Calculates and returns BMI 
	public int getBMI ()
	{
		return (Weight * 703) / (Height * Height);
	}
}
