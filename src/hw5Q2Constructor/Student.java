package hw5Q2Constructor;

public class Student {

	// variable Declare;
	public String stName;
	public int stID;
	public char stGender;
	public boolean stIsProgrammer;
	public float stGrade;

	// Default Constructor

	public Student() {
		System.out.println("This is from the default Constructor of the Student Class.");

	}

	// Parameterized Constructor Declared

	public Student(String stName, int stID, char stGender, boolean stIsProgrammer, float stGrade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.stGender = stGender;
		this.stIsProgrammer = stIsProgrammer;
		this.stGrade = stGrade;
		System.out.println("Student Name: " + stName + ", ID: " + stID + ", Gender: " + stGender + ", Grade: " + stGrade
				+ ", Java Programmer? Ans: " + stIsProgrammer);
	}

}
