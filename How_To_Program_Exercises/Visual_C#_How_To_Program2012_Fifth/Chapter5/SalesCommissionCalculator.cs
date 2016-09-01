/********************************************************
*	Sales Commission Calculator 						*
*	App that inputs one salesperson's items	sold,		*
*	then calculates and displays that person's earnings	*
*	Salary = 200 * sales * 9 / 100						*
*********************************************************/

using System;

class SalesCommmissionCalculator
{
	public static void Main (string[] args)
	{
		int itemNumber, unitsSold;
		double itemSales = 0, salary;
		
		Console.WriteLine ("Item    Value");
		Console.WriteLine ("   1    239.99");
		Console.WriteLine ("   2    129.75");
		Console.WriteLine ("   3     99.95");
		Console.WriteLine ("   4    350.89");
		
		Console.Write ("\nEnter the item number between 1 and 4 (-1 to quit): ");
		itemNumber = Convert.ToInt32(Console.ReadLine());
		
		while ( itemNumber != -1 )
		{
			Console.Write("Enter units sold: ");
			unitsSold = Convert.ToInt32(Console.ReadLine());
			
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
			
			Console.Write ("\nEnter the item number between 1 and 4 (-1 to quit): ");
			itemNumber = Convert.ToInt32(Console.ReadLine());
		}
		
		salary = 200 + itemSales * 9 / 100;
		
		Console.WriteLine("Salary is {0:C}", salary);
		
	}
}