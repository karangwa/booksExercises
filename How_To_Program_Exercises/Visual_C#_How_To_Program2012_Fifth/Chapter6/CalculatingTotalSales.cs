/********************************************************************************
 *				Calculating Total Sales											*
 *	A mail order house sells five different products whose retail prices are: 	*
 *	product 1 — $2.98, product 2—$4.50, product 3—$9.98, product 4—$4.49 and 	*
 *	product 5— $6.87. The program reads a series of pairs of numbers as follows:*
 * 	a) product number															*
 *	b) quantity sold															*
 * and determines the retail price for each product								*
 * 	Visual C# 2012 How To Program Deitel Exercise 6.17  						*
 ********************************************************************************/

using System;
 
class CalculatingTotalSales
{
	public static void Main (string[] args)
	{
		//Initialize variables
		int productNum;	//product number	
		int quantitySold;	//quantity sold
		decimal totalSales = 0M;	//total retail price
		
		Console.Write("Enter the product number and the quantity sold (-1 to end): ");
		string[] input = Console.ReadLine().Split();
		productNum = Convert.ToInt32(input[0]);
		
		//Enter the rest of the data
		while (productNum != -1)
		{
			quantitySold = Convert.ToInt32(input[1]);
			
			//Calculate current total sales
			switch (productNum)
			{
			case 1:
				totalSales += quantitySold * 2.98M;
				break;
			case 2:
				totalSales += quantitySold * 4.50M;
				break;
			case 3:
				totalSales += quantitySold * 9.98M;
				break;
			case 4:
				totalSales += quantitySold * 4.49M;
				break;
			case 5:
				totalSales += quantitySold * 6.87M;
				break;
			default:
				//Error message
				Console.WriteLine("The product number you entered is invalid. Please try again.");
				break;
			}
			
			//Enter product number and quantity sold
			Console.Write("Enter the product number and the quantity sold (-1 to end): ");
			input = Console.ReadLine().Split();
			productNum = Convert.ToInt32(input[0]);
		}
		
		Console.WriteLine("\n\nTotal sales: {0:c}", totalSales);
	}
}