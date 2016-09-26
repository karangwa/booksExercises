/************************************************************
 * 		Drawing Patterns with Nested for Loops				*
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
 *	C++ How To Program Deitel 8th Edition Exercise 5.12 	*
 ************************************************************/

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	//Printing (a)
	cout << "(a)\n";
	for(int row = 0; row < 10; ++row)
	{
		for (int column = 0; column <= row; ++column)
			cout << '*';

		cout << endl;
	}
	
	//Printing (b)
	cout << "\n(b)\n";
	for (int row = 0; row < 10; ++row)
	{
		for (int column = 10; column > row; --column)
			cout << '*';
		cout << endl;
	}

	//Printing (c)
	cout << "\n(c)\n";
	for (int row = 0; row < 10; ++row)
	{
		for (int column = 10; column > 0; --column)
			if (column + row > 10)
				cout << ' ';
			else
				cout << '*';
		cout << endl;
	}
	
	//Printing (d)
	cout << "\n(d)\n";
	for(int row = 0; row < 10; ++row)
	{
		for (int column = 0; column < 10; ++column)
			if (column + row >= 9)
				cout << '*';
			else
				cout << ' ';
		cout << endl;
	}	
	//Printing (a) (b) (c) (d) side by side
	cout << "\n(a)" << setw(15) << "(b)"
		<< setw(15) << "(c)" << setw(15) << "(d)\n";

	for(int row = 0; row < 10; ++row)
	{
		//a
		for (int column = 0; column < 10; ++column)
			if (column <= row)
				cout << '*';
			else
				cout << ' ';

		cout << setw(5);

		//(b)
		for (int column = 10; column > 0; --column)
			if (column > row)
				cout << '*';
			else
				cout << ' ';
		
		cout << setw(5);

		//(c)
		for (int column = 10; column > 0; --column)
			if (column + row > 10)
				cout << ' ';
			else
				cout << '*';

		cout << setw(5);
		//(d)
		for (int column = 0; column < 10; ++column)
			if (column + row >= 9)
				cout << '*';
			else
				cout << ' ';

		cout << endl;
	}
} 
