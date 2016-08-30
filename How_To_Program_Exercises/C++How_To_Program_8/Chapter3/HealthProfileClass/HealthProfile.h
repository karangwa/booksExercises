//
//	HealthProfile Class Header
//

#include <string>

class HealthProfile
{
private: 
	std::string firstName;
	std::string lastName;
	std::string gender;
	
	int height;
	int weight;
	int age;
	
	int dayOfBirth;
	int monthOfBirth;
	int yearOfBirth;
	
public: 
	HealthProfile(std::string, std::string, std::string, int, int, int, int, int);
	std::string getFirstName();
	void setFirstName (std::string);
	
	//Set and get functions for lastName
	std::string getLastName();
	void setLastName (std::string);
	
	//Functions to set and get Gender
	std::string getGender();
	void setGender (std::string);
	
	//height set and get functions
	int getHeight();
	void setHeight (int);
	
	//weight get and set functions
	int getWeight();
	void setWeight (int);
	
	//age get and set methods
	int getAge();
	void setAge();

	//Get Maximum Heart Rate
	int getMaxHeartRate();

	//Get Target Heart Rate
	int getTargetHeartRate();


	//Get BMI
	int getBMI();

};