//
//	Date Class Header
//

class Date
{
private:
	int month;	//Must be between 1 - 12
	int day;
	int year;
	
public:
	Date (int, int, int);	//Constructor
	
	int getMonth();			//Returns value of month 
	void setMonth(int);		//Sets value of month
	
	int getDay();			//Returns value of day 
	void setDay(int);		//Sets day to new value
	
	int getYear();			//Function to get year
	void setYear(int);		//Function to set year


	void displayDate();		//Function to display date
};