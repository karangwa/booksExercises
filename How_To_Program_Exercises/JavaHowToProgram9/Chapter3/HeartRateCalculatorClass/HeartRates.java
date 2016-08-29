//
//	HeartRates Class
//	Calculates Maximum and Target Heart Rates
//

class HeartRates
{
	private String firstName;
	private String lastName;
	private int age;	
	private int day;	//Contains birth date
	private int month;	//Contains birth month 
	private int year;	//Contains birth year
	
	//Constructor
	public HeartRates (String fName, String lName, int d, int m, int y)
	{
		firstName = fName;
		lastName = lName;
		day = d;
		month = m;
		year = y;
	}
	
	//Returns the firstName field
	public String getFirstName ()
	{
		return firstName;
	}
	
	//Sets the firstName field
	public void setFirstName (String fName)
	{
		firstName = fName;
	}
	
	//Returns field lastName
	public String getLastName ()
	{
		return lastName;
	}
	
	//Sets lastName field
	public void setLastName (String lName)
	{
		lastName = lName;
	}
	
	//Sets date of birth fields
	public void setDateOfBirth (int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}
	
	//Calculates and return the age provided current date
	public int getAge ( int d, int m, int y)
	{
		age = y - year;
		
		if ( month > m )
			age = age - 1;
			
		if ( month == m )
			if ( day > d )
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
}