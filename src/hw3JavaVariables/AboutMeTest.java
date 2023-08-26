package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe(); // Constructor initialized here

		System.out.println("I am arabian: " + aboutMe.iAmArabian + "\nMy name: " + aboutMe.myName
				+ "\nMy daughter's grade: " + aboutMe.myDaughterGrade + "\nMy Age: " + aboutMe.myAge
				+ "\nMy Bank Balance: " + aboutMe.myBankBalance + "\nMy Monthly Salary: " + aboutMe.myMonthlySalary
				+ "\nMy Address: " + aboutMe.myAddressNumber + "\nMy Laptop Price: " + aboutMe.myLaptopPrice
				+ "\nMy Gender: " + aboutMe.myGender);

		aboutMe.aboutMe();

	}
}
