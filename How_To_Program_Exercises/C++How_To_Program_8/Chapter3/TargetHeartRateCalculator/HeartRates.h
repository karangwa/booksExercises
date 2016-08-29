//
// HeartRates Header
//
#include <string>
class HeartRates
{
private:
	std::string firstName;	//Stores First Name
	std::string lastName;	//Stores Last Name

	//Date of birth attributes
	int birthYear;	//Stores Birth Year
	int birthMonth;	//Stores Birth Month
	int birthDay;	//Stores Birth Day

	int age;

public:
	//Constructor
	HeartRates(std::string, std::string, int, int, int);

	//Sets First Name
	void setFirstName(std::string);

	//Returns First Name
	std::string getFirstName();

	//Sets Last Name
	void setLastName(std::string);

	//Returns Last Name
	std::string getLastName();

	//Set Birthday
	void setBirthDay(int, int, int);

	//Returns Age
	int getAge();

	//Returns Maximum Heart Rate
	int getMaximumHeartRate();

	//Returns Target Heart Rate
	int getTargetHeartRate();
};