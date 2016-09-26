/************************************************************
 * 		Triangle Printing Program With Nested for Loops		*
 * (a) 			(b) 		(c) 			(d)				*
 *	* 			********** 	********** 	         *			*
 *	** 			********* 	 ********* 	        **			*
 *	*** 		******** 	  ******** 	       ***			*
 *	**** 		******* 	   ******* 	      ****			*
 *	***** 		****** 			****** 		 *****			*
 *	****** 		***** 			 ***** 		******			*
 *	******* 	**** 			  **** 	   *******			*
 *	********    *** 			   *** 	  ********			*
 *	********* 	** 					** 	 *********			*
 *	**********  * 					 *	**********			*
 *	Java How To Program Deitel  9th Edition Exercise 5.15 	*
 ************************************************************/
 
class TrianglePrintingWithForLoop
{
	public static void main (String [] args)
	{
		//Printing (a)
		System.out.println("(a)");
		for(int row = 0; row < 10; ++row)
		{
			for (int column = 0; column <= row; ++column)
				System.out.print('*');

			System.out.println();
		}
		
		//Printing (b)
		System.out.println("\n(b)");
		for (int row = 0; row < 10; ++row)
		{
			for (int column = 10; column > row; --column)
				System.out.print('*');
			System.out.println();
		}

		//Printing (c)
		System.out.println("\n(c)");
		for (int row = 0; row < 10; ++row)
		{
			for (int column = 10; column > 0; --column)
				if (column + row > 10)
					System.out.print(' ');
				else
					System.out.print('*');
			System.out.println();
		}
		
		//Printing (d)
		System.out.println("\n(d)");
		for(int row = 0; row < 10; ++row)
		{
			for (int column = 0; column < 10; ++column)
				if (column + row >= 9)
					System.out.print('*');
				else
					System.out.print(' ');
			System.out.println();
		}	
		//Printing (a) (b) (c) (d) side by side
		System.out.printf("\n%s%15s%15s%15s\n", "(a)", "(b)", "(c)", "(d)");

		for(int row = 0; row < 10; ++row)
		{
			//a
			for (int column = 0; column < 10; ++column)
				if (column <= row)
					System.out.print('*');
				else
					System.out.print(' ');

			System.out.printf("%4s", " ");

			//(b)
			for (int column = 10; column > 0; --column)
				if (column > row)
					System.out.print('*');
				else
					System.out.print(' ');
			
			System.out.printf("%4s", " ");

			//(c)
			for (int column = 10; column > 0; --column)
				if (column + row > 10)
					System.out.print(' ');
				else
					System.out.print('*');

			System.out.printf("%4s", " ");
			//(d)
			for (int column = 0; column < 10; ++column)
				if (column + row >= 9)
					System.out.print('*');
				else
					System.out.print(' ');

			System.out.println();
		}
	}
}