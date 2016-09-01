/****************************************************************
 * 	Program that reads three nonzero integers and determines	*
 *	and prints whether they’re the sides of a right triangle.	*
 ****************************************************************/
 
 #include <iostream>
 
 int main()
 {
	double a, b, c;
	
	std::cout << "Enter three non-zero double values: ";
	std::cin >> a >> b >> c;
	
	std::string str = "The three sides could not represent the sides of a right triangle";
	
	if (a*a + b*b == c*c)
		str =  "The three sides could represent the sides of a triangle";
	
	if (a*a + c*c == b*b)
		str =  "The three sides could represent the sides of a triangle";
			
	if (b*b + c*c == a*a)
		str =  "The three sides could represent the sides of a triangle";
	
	std::cout << str << std::endl << std::endl;
 }