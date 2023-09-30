package hw11UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;
	

	public Daughter() {// default constructor declare

		super();
		super.father();
		super.familyName = "my daughter";
		super.fatherInfo("Fatema", 12, 'F', true);

		System.out.println("My daughter");

	}

	public Daughter(String birthMonth, int age) {// parameterized constructor
		
		super("Fatema", 12, 'F', true);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("My daughter age");
		
super.father();
super.fatherInfo("Fatema", 12, 'F', true);

	}

	public void daughter(String birthMonth, int age) {// method implemented
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("My daughter");
	
	}

	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("birth month: " + this.birthMonth + "\n My Age: " + this.age);

	}

}
