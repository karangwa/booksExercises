//
// HeartRatesTest Class
//
using System;
class HeartRatesTest
{
	public static void Main (string[] args)
	{
		string fName, lName;
		
		int birthYear, currYear;
		
		Console.Write("\nEnter your first name: ");
		fName = Console.ReadLine();
		Console.Write("\nEnter your last name:");
		lName = Console.ReadLine();
		
		//Prompt birth year
		Console.Write("\nEnter your birth year: ");
		birthYear = Convert.ToInt32(Console.ReadLine());
		
		//Prompt current year
		Console.Write("\nEnter the current year: ");
		currYear = Convert.ToInt32(Console.ReadLine());
		
		HeartRates heartRate = new HeartRates (fName, lName, birthYear, currYear);
	
		Console.WriteLine("\n\nYour information\n------------------");
		Console.WriteLine("Name: {0} {1}", heartRate.FirstName, heartRate.LastName);
		Console.WriteLine("Age: {0}", heartRate.Age);
		Console.WriteLine("Maximum Heart Rate: {0}\nTarget Heart Rate: {1}", 
							heartRate.MaximumHeartRate, heartRate.TargetHeartRate);
	}
}