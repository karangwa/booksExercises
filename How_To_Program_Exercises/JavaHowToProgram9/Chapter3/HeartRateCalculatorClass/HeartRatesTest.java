//
// HeartRates Class Test
//

import java.util.Scanner;

class HeartRatesTest
{
	public static void main (String[] args)
	{
		String fName, lName;
		int birthDay, birthMonth, birthYear, currDay, currMonth, currYear;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("\nEnter your first name: ");
		fName = input.next();
		System.out.print("\nEnter your last name: ");
		lName = input.next();
		
		//Prompt birthdate
		System.out.print("\nEnter your birth date: ");
		birthDay = input.nextInt();
		System.out.print("Enter your birth month: ");
		birthMonth = input.nextInt();
		System.out.print("Enter your birth year: ");
		birthYear = input.nextInt();
		
		//Prompt current date
		System.out.print("\nEnter today's date: ");
		currDay = input.nextInt();
		System.out.print("Enter today's month: ");
		currMonth = input.nextInt();
		System.out.print("Enter today's year: ");
		currYear = input.nextInt();
		
		//Instantiate instance of HeartRates
		HeartRates heartRate = new HeartRates(fName, lName, birthDay, birthMonth, birthYear);
	
		//Display information
		System.out.println("\n\nYour information:\n-------------------");
		System.out.printf("Name: %s %s\n", heartRate.getFirstName(), heartRate.getLastName());
		System.out.printf("Age: %d", heartRate.getAge(currDay, currMonth, currYear));
		System.out.printf("\nMaximum Heart Rate: %d", heartRate.getMaximumHeartRate());
		System.out.printf("\nTarget Heart Rate: %d\n\n", heartRate.getTargetHeartRate());
	
	}
}