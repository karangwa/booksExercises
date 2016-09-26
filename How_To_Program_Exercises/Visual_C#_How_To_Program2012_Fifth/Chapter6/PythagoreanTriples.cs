/********************************************************************************	
 *				Pythagorean Triples												*
 *	Program that finds all integer Pythagorean triples no larger than 500 		*
 *	We use brute force to find the triples										*
 * 	Visual C# 2012 How To Program Deitel Exercise 6.21  						*
 ********************************************************************************/
 
using System;
 
class PythagoreanTriples
{
	public static void Main (string[] args)
	{
		//Declare & Initialize variables
		int triplesFound = 0;
		
		Console.WriteLine("{0, 10}{1, 10}{2, 10}", "Side1", "Side2", "Side3");
		
		//Find Pythagorean triples
		for (int side1 = 1; side1 <= 500; ++side1)
		{
			for(int side2 = 1; side2 <= 500; ++side2)
			{
				for(int side3 = 1; side3 <= 500; ++side3) 
				{
					if ((side3*side3) == ((side2*side2) + (side1*side1)))
					{
						triplesFound++;
						Console.WriteLine("{0, 10}{1, 10}{2, 10}", side1, side2, side3);
					}
				}
			}		
		}
		Console.WriteLine("\n\nTotal Pythagorean Triples found: {0}", triplesFound);
	}
}