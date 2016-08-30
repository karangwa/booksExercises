//
//	HealthProfile Tester
//

import java.util.Scanner;

class HealthProfileTest
{
	public static void main (String[] args)
	{
		String fName, lName, gender;
		int currDay, currMonth, currYear;
		int birthDay, birthMonth, birthYear;
		int height, weight;
		
		Scanner input = new Scanner (System.in);
		
		//Prompt first and last names
		System.out.print("Enter your first and last names: ");
		fName = input.next();
		lName = input.next();
		
		//Prompt gender
		System.out.print("Enter your gender (Male/Female): ");
		gender = input.next();
		
		//Prompt date of birth 
		System.out.print("Enter your date of birth (d m y): ");
		birthDay = input.nextInt();
		birthMonth = input.nextInt();
		birthYear = input.nextInt();
		
		//Prompt current date
		System.out.print("Enter the current date (d m y): ");
		currDay = input.nextInt();
		currMonth = input.nextInt();
		currYear = input.nextInt();
		
		//Prompt weight and height
		System.out.print("Enter your height in inches: ");
		height = input.nextInt();
		System.out.print("Enter your weight in pounds: ");
		weight = input.nextInt();
		
		HealthProfile profile = new HealthProfile (fName, lName, gender, birthDay, birthMonth, birthYear, height, weight);
		
		
		
		System.out.println("\n\n\nYour information\n-----------------");
		System.out.println("Name: " + profile.getFirstName() + " " + profile.getLastName());
		System.out.printf("\nGender: %s\nAge: %d\n", profile.getGender(), profile.getAge(currDay, currMonth, currYear));
		System.out.printf("\n\nHeight: %din\nWeight: %dlbs", profile.getHeight(), profile.getWeight());
		
		System.out.println("\n\nMaximum Heart Rate: " + profile.getMaximumHeartRate());
		System.out.println("\nTarget Heart Rate: " + profile.getTargetHeartRate());
		
		System.out.println("\nBMI: " + profile.getBMI());
		
		String message = "\n\n\nBMI: BMI VALUES" +
                        "\nUnderweight: less than 18.5" + "\nNormal: between 18.5 and 24.9" +
                        "\nOverweight: between 25 and 29.9" + "\nObese: 30 or greater";

		System.out.println(message);
	} 
}