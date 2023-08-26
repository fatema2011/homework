package hw4JavaVariables;

public class AboutMe {

//all the variables below declared here
public String myName;
public byte myAge;
public short myAddressNumber;
public int myBankBalance;
public long myMonthlySalary;
public float myDaughterGPA;
public double myHeight;
public char myGender;
public boolean usCitizen;

// Constructor declared
public AboutMe() {
    System.out.println("This is all about us:");
}

public void aboutMe() { //method implemented here
System.out.println("My Name: " + myName + "\nMy Age: " + myAge + "\nMy Street Address: " + myAddressNumber + "\nMy Bank Balance:  " + myBankBalance + "\nMy Monthly Salary: " + myMonthlySalary + "\nMy Daughter's GPA: " + myDaughterGPA + "\nMy Height: " + myHeight + "\nMy Gender: " + myGender + "\nI am US Citizen: " + usCitizen);	
}
	
}

