/********************************************************************************
 *				Calculating Total Sales											*
 *	A mail order house sells five different products whose retail prices are: 	*
 *	product 1 — $2.98, product 2—$4.50, product 3—$9.98, product 4—$4.49 and 	*
 *	product 5— $6.87. The program reads a series of pairs of numbers as follows:*
 * 	a) product number															*
 *	b) quantity sold															*
 * and determines the retail price for each product								*
 * 	Java How To Program Deitel 9th Edition Exercise 5.17 						*
 ********************************************************************************/

import java.util.Scanner;

class CalculatingTotalSales
{
	public static void main (String[] args)
	{
		//Initialize variables
		int productNum;	//product number	
		int quantitySold;	//quantity sold
		double totalSales = 0.0;	//total retail price
		
		Scanner input = new Scanner (System.in);
		
		//Enter product number and quantity sold
		System.out.print("Enter the product number and the quantity sold (-1 to end): ");
		productNum = input.nextInt();
		
		//Enter the rest of the data
		while (productNum != -1)
		{
			quantitySold = input.nextInt();
			
			//Calculate current total sales
			switch (productNum)
			{
			case 1:
				totalSales += quantitySold * 2.98;
				break;
			case 2:
				totalSales += quantitySold * 4.50;
				break;
			case 3:
				totalSales += quantitySold * 9.98;
				break;
			case 4:
				totalSales += quantitySold * 4.49;
				break;
			case 5:
				totalSales += quantitySold * 6.87;
				break;
			default:
				//Error message
				System.out.println("The product number you entered is invalid. Please try again.");
				break;
		}
		
		//Enter product number and quantity sold 
		System.out.print("Enter the product number and the quantity sold (-1 to end): ");
		productNum = input.nextInt();
	}
		
		System.out.printf("\n\nTotal sales: %.2f\n", totalSales);
	}
}