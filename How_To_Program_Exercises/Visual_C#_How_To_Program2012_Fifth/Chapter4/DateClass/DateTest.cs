//
//	DateTest Class
//

using System;

class DateTest
{
	public static void Main (string[] args)
	{
		
		Console.WriteLine("First instance of Date");
		Console.WriteLine("-----------------------");
		
		Date date1 = new Date (12, 9, 1989);
		
		Console.WriteLine("Displaying date1: ");
		date1.DisplayDate();
		
		Console.WriteLine("\n\nnSecond instance of Date");
		Console.WriteLine("-----------------------------");
		
		Date date2 = new Date(1, 1, 1900);
		Console.WriteLine("Displaying date2: ");
		date2.DisplayDate();
		
		Console.WriteLine("\n\nModifying values of date2");
		Console.WriteLine("-----------------------------");
		
		Console.Write("Enter new day of date2: ");
		date2.Day = Convert.ToInt32(Console.ReadLine());
		
		Console.Write("Enter new month of date2: ");
		date2.Month = Convert.ToInt32(Console.ReadLine());
		
		Console.Write("Enter new year of date2: ");
		date2.Year = Convert.ToInt32(Console.ReadLine());
		
		Console.Write("\n\nDisplaying new values for date2: ");
		date2.DisplayDate();
		
	}
}