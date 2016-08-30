//
//	Gas Mileage Program
//	Inputs miles driven and gallons used
//	Calculates miles per gallons 
//

using System;

class GasMileage
{
	public static void Main (string[] args)
	{
		int miles, gallons, totalMiles, totalGallons;
		totalGallons = totalMiles = 0;
		
		//Prompt miles driven and gallons used
		Console.Write("Enter miles driven (-1 to terminate): ");
		miles = Convert.ToInt32(Console.ReadLine());
		
		while ( miles != -1)
		{
			Console.Write("Enter gallons used: ");
			gallons = Convert.ToInt32(Console.ReadLine());
			
			//Print miles/gallons
			Console.WriteLine("Miles per gallons for this trip: {0}\n", (double)miles/gallons);
		
			totalGallons += gallons;
			totalMiles += miles;
			
			Console.Write("\nEnter miles driven (-1 to terminate): ");
			miles = Convert.ToInt32(Console.ReadLine());
		}
		
		Console.WriteLine("\n\nTotal miles per gallons for all trips: {0:0.00}\n\n", (double)totalMiles/totalGallons);
	}
}