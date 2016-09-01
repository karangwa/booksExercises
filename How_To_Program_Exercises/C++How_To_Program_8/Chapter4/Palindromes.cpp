/************************************************
 * Program reads in a five-digit integer and	*
 * determines whether it's a palindrome			*
 ***********************************************/
 
 #include <iostream>
 
 int main ()
 {
	int number, digit1, digit2, digit4, digit5; 
		
	std::cout << "Enter a five-digit integer: ";
	std::cin >> number;
	
	digit1 = number / 10000;
	digit2 = (number % 10000 ) / 1000;
	digit4 = (number / 10) % 10;
	digit5 = number % 10;
	
	if ( digit1 == digit5 && digit2 == digit4 )
		std::cout << number << " is a palindrome.\n";
	else	
		std::cout << number << "is not a palindrome.\n";
	return 0;
 }
