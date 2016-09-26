/********************************************************************************	
 *				Pythagorean Triples												*
 *	Program that finds all integer Pythagorean triples no larger than 500 		*
 *	We use brute force to find the triples										*
 *	Java How To Program Deitel 9th Edition Exercise 5.21  						*
 ********************************************************************************/
 
class PythagoreanTriples
{
	public static void main (String[] args)
	{
		//Declare & Initialize variables
		int triplesFound = 0;
		
		System.out.printf("%10s%10s%10s\n", "Side1", "Side2", "Side3");
		
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
						System.out.printf("%10d%10d%10d\n", side1, side2, side3);
					}
				}
			}		
		}
		System.out.printf("\n\nTotal Pythagorean Triples found: %d\n", triplesFound);
	}
}