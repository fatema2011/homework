package hw11UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {

		Father f1 = new Father(); // default constructor
		f1.father();
		f1.fatherInfo("shahadat", 46, 'M', true);// parameterized constructor

		Father f2 = new Father("Shahadat", 45, 'M', true);
		f2.father();
		f2.fatherInfo("SHAHADAT", 47, 'm', false);

		Daughter d1 = new Daughter();
		d1.daughter(null, 0);
		d1.daughterInfo("March", 100);

		Daughter d2 = new Daughter();
		d2.daughter(null, 0);
		d2.daughterInfo("June", 8);

	}

}
