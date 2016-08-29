//
//	DateTest Class
//

import java.util.Scanner;

class DateTest
{
	public static void main (String[] args)
	{
		int d, m, y;
		Scanner input = new Scanner (System.in);
		
		System.out.println("First instance of Date");
		System.out.println("--------------------------------");
		
		Date date1 = new Date (12, 9, 1998);
		
		System.out.print("Displaying date: ");
		date1.displayDate();
		
		System.out.println("\n\n\nSecond instance of Date");
		System.out.println("-------------------------------------");
		
		Date date2 = new Date (1, 1, 1900);
		System.out.print("Displaying date2: ");
		date2.displayDate();
		
		System.out.println("\n\nModifying values of date2");
		System.out.println("-----------------------------");
		
		System.out.print("Enter new day of date2: ");
		d = input.nextInt();
		date2.setDay(d);
		
		System.out.print("Enter new month of date2: ");
		m = input.nextInt();
		date2.setMonth(m);
		
		System.out.print("Enter new year of date2: ");
		y = input.nextInt();
		date2.setYear(y);
		
		System.out.print("\n\nDisplaying new values for date2: ");
		date2.displayDate();

	}
}