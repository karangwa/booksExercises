//
// Date Class
//
using System;
class Date
{
	public int Day {get; set;}
	public int Month {get; set;}
	public int Year {get; set;}
	
	public Date (int d, int m, int y)
	{
		Day = d;
		Month = m;
		Year = y;
	}
	
	public void DisplayDate ()
	{
		Console.WriteLine ("{0}/{1}/{2}", Day, Month, Year);
	}
}