/****************************************************************	
 * 	This program prints multiples of 2 with an Infinite Loop	*
 ***************************************************************/
 
 #include <iostream>
 
 int main ()
 {
	int n = 1;
	
	while (true)	//Infinite Loop
	{
		std::cout << n << std::endl;
		n *= 2; 	 
	}
 }

