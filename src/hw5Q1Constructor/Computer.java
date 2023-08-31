package hw5Q1Constructor;

public class Computer {

	public static void main(String[] args) {

	}

// variables declared

	public String brand;
	public String model;
	public String operatinSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

// default Constructor declared
	public Computer() {
		System.out.println("This is from the Default Constructor of Computer Class");
	}

//parameterized Constructor declared
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatinSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Brand: " + brand + "\nComputer Model: " + model + "\nOperating System: " + operatingSystem
				+ "\nComputer Price:: " + price + "\nGrade: " + grade + "\nThis computer is made in USA: " + madeInUSA);

	}

	public Computer(String brand, String model, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Brand: " + brand + "\nComputer Model: " + model + "\nComputer Price:: " + price
				+ "\nGrade: " + grade + "\nThis computer is made in USA: " + madeInUSA);

	}

}
