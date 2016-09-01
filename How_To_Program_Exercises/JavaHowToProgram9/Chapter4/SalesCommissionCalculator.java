/********************************************************
*	Sales Commission Calculator 						*
*	App that inputs one salesperson's items	sold,		*
*	then calculates and displays that person's earnings	*
*	Salary = 200 * sales * 9 / 100						*
*********************************************************/

import java.util.Scanner;

class SalesCommissionCalculator
{
	public static void main (String[] args)
	{
		int itemNumber, unitsSold;
		double itemSales = 0, salary; 
		Scanner input = new Scanner (System.in);
		
		System.out.println("Item    Value");
		System.out.println("   1    239.99");
		System.out.println("   2    129.75");
		System.out.println("   3     99.95");
		System.out.println("   4    350.89");
		System.out.print("Enter the item number between 1 and 4 (-1 to quit): ");
		itemNumber = input.nextInt();
		
		while ( itemNumber != -1 )
		{
			System.out.print("Enter units sold: ");
			unitsSold = input.nextInt();
			
			if ( itemNumber == 1 )
			{
				itemSales += 239.99 * unitsSold;
			} 
			else if ( itemNumber == 2 )
			{
				itemSales += 129.75 * unitsSold;
			}
			else if ( itemNumber == 3 )
			{
				itemSales += 99.95 * unitsSold;
			}
			else if ( itemNumber == 4 )
			{
				itemSales += 350.89 * unitsSold;
			}
			else
			{
				itemSales += 0;
			}
			
			System.out.print("Enter the item number between 1 and 4 (-1 to quit): ");
			itemNumber = input.nextInt();
		}
		
		salary = 200 + itemSales * 9 / 100;
		
		System.out.printf("Salary is $%.2f", salary);
	}
}