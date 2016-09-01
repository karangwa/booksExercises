/********************************************************
 *	This program reads three nonzero double values and	*
 *	determines and prints whether they could represent 	*
 *	the sides of a triangle								*
 ********************************************************/

 #include <iostream>
 #include <string>
 
int main ()
{
	double a, b, c;
	
	std::cout << "Enter three non-zero double values: ";
	std::cin >> a >> b >> c;
	
	std::string str = "The three sides could not represent the sides of a triangle";
	
	if (a + b > c)
	{
		if (a + c > b)
			if (b + c > a)
				str =  "The three sides could represent the sides of a triangle";
	}
	
	std::cout << str << std::endl << std::endl;
}
 
