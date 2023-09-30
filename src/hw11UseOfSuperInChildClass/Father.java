package hw11UseOfSuperInChildClass;

public class Father {

	// variable declare

	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	// default Constructor declared
	public Father() {
		System.out.println("This is a father class");
	}
	// parameterized Constructor declared
	public Father(String Name, int age, char sex, boolean usCitizen) {
		this.Name = Name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
	}
	public void father() {
		System.out.println(" This void type method");
	}
// method declared		
// method implemented
	public void fatherInfo(String Name, int age, char sex, boolean usCitizen) {
		
		this.Name = Name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;

		System.out.println(
				"My Name" + this.Name + "\n My Age" + age + "\n My Gender " + sex + "\n My usCitizen" + this.usCitizen);

	}

	}


