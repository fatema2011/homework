
package hw11Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {// non abstract method, implemented method, concrete method, with body({})
		// method
		System.out.println("This is Medical School.");

	}

// one or more than one.

// yes, Abstract Class inherit another Abstract Class.

// or a regular class or interface by extends keyword ---> No

// How many inheritances are possible in an Abstract Class ---> only one.

//  how many keywords are used for the inheritance in Java for Abstract Class?
//	 Ans: extends keyword and implemented can one  or  more then one inheritance Abstract Class.

}
