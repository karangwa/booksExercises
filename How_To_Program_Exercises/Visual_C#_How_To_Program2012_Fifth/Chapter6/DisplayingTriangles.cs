/************************************************************
 * 		Displaying Triangles With Nested for Loops			*
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
 *	Visual C# 2012 How To Program Deitel  Exercise 6.15 	*
 ************************************************************/
 
using System;
 
class DisplayingTriangles
{
	public static void Main (string[] args)
	{
			//Printing (a)
		Console.WriteLine("(a)");
		for(int row = 0; row < 10; ++row)
		{
			for (int column = 0; column <= row; ++column)
				Console.Write('*');

			Console.WriteLine();
		}
		
		//Printing (b)
		Console.WriteLine("\n(b)");
		for (int row = 0; row < 10; ++row)
		{
			for (int column = 10; column > row; --column)
				Console.Write('*');
			Console.WriteLine();
		}

		//Printing (c)
		Console.WriteLine("\n(c)");
		for (int row = 0; row < 10; ++row)
		{
			for (int column = 10; column > 0; --column)
				if (column + row > 10)
					Console.Write(' ');
				else
					Console.Write('*');
			Console.WriteLine();
		}
		
		//Printing (d)
		Console.WriteLine("\n(d)");
		for(int row = 0; row < 10; ++row)
		{
			for (int column = 0; column < 10; ++column)
				if (column + row >= 9)
					Console.Write('*');
				else
					Console.Write(' ');
			Console.WriteLine();
		}	
		//Printing (a) (b) (c) (d) side by side
		Console.WriteLine("\n{0}{1, 15}{2, 15}{3, 15}", "(a)", "(b)", "(c)", "(d)");

		for(int row = 0; row < 10; ++row)
		{
			//a
			for (int column = 0; column < 10; ++column)
				if (column <= row)
					Console.Write('*');
				else
					Console.Write(' ');

			Console.Write("{0, 4}", " ");

			//(b)
			for (int column = 10; column > 0; --column)
				if (column > row)
					Console.Write('*');
				else
					Console.Write(' ');
			
			Console.Write("{0, 4}", " ");

			//(c)
			for (int column = 10; column > 0; --column)
				if (column + row > 10)
					Console.Write(' ');
				else
					Console.Write('*');

			Console.Write("{0, 4}", " ");
			//(d)
			for (int column = 0; column < 10; ++column)
				if (column + row >= 9)
					Console.Write('*');
				else
					Console.Write(' ');

			Console.WriteLine();
		}
	}
}