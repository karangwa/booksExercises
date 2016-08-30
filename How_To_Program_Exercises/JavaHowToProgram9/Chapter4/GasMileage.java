//
//	Gas Mileage Program
//	Inputs miles driven and gallons used
//	Calculates miles per gallons 
//

import java.util.Scanner;

class GasMileage
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);	//Scanner object to input data
		int miles, gallons, totalMiles, totalGallons, milesPerGallons;
		totalGallons = totalMiles = 0;
		
		//Prompt miles driven and gallons used
		System.out.print("Enter miles driven (-1 to terminate): ");
		miles = input.nextInt();
		
		while ( miles != -1 )
		{
			System.out.print("Enter gallons used: ");
			gallons = input.nextInt();
			
			//Print miles/gallons
			System.out.printf("Miles per gallons for this trip: %.2f\n", (double)miles/gallons);
			
			totalGallons += gallons;	
			totalMiles += miles;
			
			System.out.print("\nEnter miles driven (-1 to terminate): ");
			miles = input.nextInt();
		}
		
		System.out.printf("\n\nTotal miles per gallons for all trips: %.2f\n\n", (double)totalMiles/totalGallons);
		
		
	}
}