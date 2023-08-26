package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // Constructor initialized here
		aboutMe.myName = "Fatema Aktar";
		aboutMe.myAge = 25;
		aboutMe.myAddressNumber = 12345;
		aboutMe.myBankBalance = 1651615661;
		aboutMe.myDaughterGPA = 1.65654f;
		aboutMe.myHeight = 1.66648885564646;
		aboutMe.myGender = 'F';
		aboutMe.usCitizen = true;
		aboutMe.myMonthlySalary = 55659846164448479l;
		aboutMe.aboutMe(); // method is initialized here

		AboutMe alex = new AboutMe(); // Constructor initialized here
		alex.myName = "Alex";
		alex.myAge = 50;
		alex.myAddressNumber = 12896;
		alex.myBankBalance = 165165961;
		alex.myDaughterGPA = 3.65654f;
		alex.myHeight = 2.6664825664646;
		alex.myGender = 'M';
		alex.usCitizen = false;
		alex.myMonthlySalary = 5689546264165l;
		alex.aboutMe(); // method is initialized here

	}

}
