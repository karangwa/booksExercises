/********************************************************************
 * Program that estimates the value of the mathematical constant e	*
 *******************************************************************/
 
 #include <iostream>
 
 int main ()
 {
	int n = 0;
	double e = 1;
	
	while (++n < 10)
	{
		//Calculate n!
		int factorial = 1;
		int factControl = n;
		
		while (factControl > 0)
		{
			factorial = factorial * factControl;
			factControl--;
		}
		
		
		//Calculate current iteration value of e
		e += 1.0 / factorial;
	}
	
	std::cout << "\ne = " << e << std::endl << std::endl;

 }