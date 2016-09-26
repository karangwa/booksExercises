/********************************************************************************	
 *				Calculating the value of PI										*
 *	Program that estimates the value of PI using an infinite series				*
 * 	Java How To Program Deitel 9th Edition Exercise 5.20						*
 ********************************************************************************/
 
 class CalculatingPI
 {
	public static void main (String[] args)
	{
		//Initialize PI
		double PI = 0.0;
		
		//Display Table Header
		System.out.printf("%-10s%-10s\n", "Level", "PI Value");
		
		//Calculate PI
		for(int i = 1, j = 1; i <= 500000; i++, j+=2)
		{
			if (i % 2 != 0)
				PI += 4.0 / j;
			else
				PI -= 4.0 / j;

			if ( i % 10000 == 0)
				System.out.printf("%-10d%-10.8f\n", i, PI);
		}
	}
 }