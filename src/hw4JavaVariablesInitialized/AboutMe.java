package hw4JavaVariablesInitialized;

public class AboutMe {

	public String myDaughterName; // variable declared
	public String myName = "Fatema Aktar"; // variable initialized
	public byte myAge = 31;
	public short myMonthlySalary = 2000;
	public int myLaptopPrice = 5000;
	public long myAddressNumber = 12047;
	public float myBankBalance = 1.2349567f;
	public double myDaughterGrade = 4.0000000000000000;
	public boolean iAmArabian = true;
	public char myGender = 'F';

	public AboutMe() { // Constructor declared here
		System.out.println("------------ This is all about Myself -------");
	}

	public void aboutMe() { // method implemented here
		System.out.println("I am arabian: " + iAmArabian + "\nMy name: " + myName + "\nMy daughter's grade: "
				+ myDaughterGrade + "\nMy Age: " + myAge + "\nMy Bank Balance: " + myBankBalance
				+ "\nMy Monthly Salary: " + myMonthlySalary + "\nMy Address: " + myAddressNumber + "\nMy Laptop Price: "
				+ myLaptopPrice + "\nMy Gender: " + myGender);
	}

}
