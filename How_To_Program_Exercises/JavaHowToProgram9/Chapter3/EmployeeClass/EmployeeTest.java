//
//	Employee Test Class
//

class EmployeeTest
{
	public static void main (String[] args)
	{
		System.out.println("\nCreating first instance of class Employee\n-------------------------------------------\n");
		Employee bojack = new Employee ("Bojack", "Horseman", 2500.00);
		
		System.out.printf("First Name: %s\nLast Name: %s\nMonthly Salary: $%.2f\nYearly Salary: $%.2f\n",
						  bojack.getFirstName(), bojack.getLastName(), bojack.getMonthlySalary(), bojack.getMonthlySalary() * 12);
		
		System.out.println("\n\n\nCreating second instance of class Employee\n---------------------------------------------\n");
		Employee morty = new Employee ("Morty", "Smith", 4000.00);
		
		System.out.printf("First Name: %s\nLast Name: %s\nMonthly Salary: $%.2f\nYearly Salary: $%.2f\n",
						  morty.getFirstName(), morty.getLastName(), morty.getMonthlySalary(), morty.getMonthlySalary() * 12);
	
		//Salary Increase
		morty.setMonthlySalary(morty.getMonthlySalary() * 1.1);
		bojack.setMonthlySalary(bojack.getMonthlySalary() * 1.1);
		
		System.out.println("\n\nAfter 10% raise\n-----------------\n");
		System.out.printf("Bojack's yearly salary: $%.2f\nMorty's yearly salary $%.2f\n",
						  bojack.getMonthlySalary() * 12, morty.getMonthlySalary() * 12);
	}
}