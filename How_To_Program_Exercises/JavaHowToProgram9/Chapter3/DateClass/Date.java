//
//
//

class Date
{	
	private int month;
	private int day;
	private int year;
	
	//Constructor
	public Date (int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}
	
	//Function to return month
	int getMonth ()
	{
		return month;
	}
	
	//Function to set month
	void setMonth (int m)
	{
		month = m;
	}
	
	//Function to return day
	int getDay ()
	{
		return day;
	}
	
	//Function to set day
	void setDay (int d)
	{
		day = d;
	}
	
	//Function to return year
	int getYear ()
	{
		return year;
	}
	
	//Function to set year
	void setYear (int y)
	{
		year = y;
	}

	//Function to display the date
	void displayDate ()
	{	
		System.out.printf("%d/%d/%d", day, month, year);
	}
}