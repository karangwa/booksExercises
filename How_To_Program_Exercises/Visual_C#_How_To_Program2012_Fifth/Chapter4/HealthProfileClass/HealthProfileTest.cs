//
//	HealthProfileTest Class
//
using System;

class HealthProfileTest
{
	public static void Main (string[] args)
	{
		string fName, lName, gender;
		int height, weight;
		int birthDay, birthMonth, birthYear; 
		
		//Prompt first name, last name and gender
		Console.Write("\nEnter your first name: ");
		fName = Console.ReadLine();
		
		Console.Write("Enter your last name: ");
		lName = Console.ReadLine();
		
		Console.Write("Enter your gender (Male/Female): ");
		gender = Console.ReadLine();
		
		//Prompt height and weight
		Console.Write("Enter your height: ");
		height = Convert.ToInt32(Console.ReadLine());
		Console.Write("Enter your weight: ");
		weight = Convert.ToInt32(Console.ReadLine());
		
		//Prompt date of birth
		Console.Write("Enter your day of birth: ");
		birthDay = Convert.ToInt32(Console.ReadLine());
		
		Console.Write("Enter your month of birth: ");
		birthMonth = Convert.ToInt32(Console.ReadLine());
		
		Console.Write("Enter your year of birth: ");
		birthYear = Convert.ToInt32(Console.ReadLine());
		
		
		//Create an instance of HealthProfile
		HealthProfile profile = new HealthProfile( fName, lName, gender, birthDay, birthMonth, birthYear, height, weight);
		
		//Call setAge  
		profile.setAge();
		
		//Display Info
		Console.WriteLine("\n\n\nYour information\n------------------");
		Console.WriteLine("Name: {0} {1}\nAge: {2}", profile.FirstName, profile.LastName, profile.Age);
		Console.WriteLine("Gender: {0}\nHeight: {1} inches\nWeight: {2} lbs", profile.Gender, profile.Height, profile.Weight);
		Console.WriteLine("Max Heart Rate: {0}\nTarget Heart Rate: {1}", profile.getMaxHeartRate(), profile.getTargetHeartRate());
		Console.WriteLine("BMI: {0}", profile.getBMI());
		Console.WriteLine("\n\n\n{0}\n{1}\n{2}\n{3}\n{4}\n\n", 
            "BMI VALUES", 
            "Underweight: less than 18.5", 
            "Normal: between 18.5 and 24.9", 
            "Overweight: between 25 and 29.9",
            "Obese: 30 or greater");

		
	}
}