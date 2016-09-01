/****************************************
 *	Analysis of examination results,	* 
 *	using nested control statements.	*
 ***************************************/
 
 #include <iostream>
 
 int main()
 {
	//initialize variables in declaration
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result = 0;
		
		while (studentCounter <= 10)
		{
			std::cout << "\nEnter result (1 = pass, 2 = fail): ";
			std:: cin >> result;
			
			if (result == 1)
				passes = passes + 1;
			else if (result == 2)
				failures = failures + 1;
			else 
			{
				std::cout << "\nInvalid Input\n";
				studentCounter = studentCounter - 1;
			}
				
			studentCounter = studentCounter + 1;
		}
		
		std::cout << "\nPassed: " << passes 
				  << "\nFailed: " << failures 
				  << std::endl << std::endl;
				  
		if (passes > 8)
			std::cout << "Bonus to instructor!";
 }