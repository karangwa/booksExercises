//
//	Computerization of Health Records Exercise
// This class stores a person's health information: BMI and Heart Rates
//

class HealthProfile
{
	private String firstName;
	private String lastName;
	private String gender;
	
	//Date of birth attributes
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	
	private int age;
	
	private int height;			//In inches
	private int weight;			//In pounds
	
	//Constructor 
	public HealthProfile (String fName, String lName, String g, int day, int month, int year, int h, int w)
	{
		firstName = fName;
		lastName = lName;
		gender = g;
		dayOfBirth = day;
		monthOfBirth = month;
		yearOfBirth = year;
		height = h;
		weight = w;
	}
	
	public void setFirstName (String fName)
	{
		firstName = fName;
	}
	
	public String getFirstName ()
	{
		return firstName;
	}
	
	public void setLastName (String lName)
	{
		lastName = lName;
	}
	
	public String getLastName ()
	{
		return lastName;
	}

	//Sets Gender
	public void setGender (String g)
	{
		gender = g;
	}
	
	//Gets Gender 
	public String getGender ()
	{
		return gender;
	}
	
	//Sets date of birth 
	public void setDateOfBirth (int d, int m, int y)
	{
		dayOfBirth = d;
		monthOfBirth = m;
		yearOfBirth = y;
	}
	
	//Sets height
	public void setHeight (int h)
	{
		height = h;
	}
	
	//Gets height
	public int getHeight ()
	{
		return height;
	}
	
	//Sets weight
	public void setWeight (int w)
	{
		weight = w;
	}
	
	//Gets weight 
	public int getWeight ()
	{
		return weight;
	}
	
		//Calculates and return the age provided current date
	public int getAge ( int d, int m, int y)
	{
		age = y - yearOfBirth;
		
		if ( monthOfBirth > m )
			age = age - 1;
			
		if ( monthOfBirth == m )
			if ( dayOfBirth > d )
				age = age - 1;
		
		return age;
	}
	
	//Calculates and returns maximum heart rate
	public int getMaximumHeartRate ()
	{
		return 220 - age;
	}
	
	//Calculates and return target heart rate
	public int getTargetHeartRate ()
	{
		return getMaximumHeartRate() * 675 / 1000;
	}

	public int getBMI ()
	{
		return (weight * 703 ) / (height * height);	
	}
}