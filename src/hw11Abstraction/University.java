package hw11Abstraction;

public interface University extends College, Hospital {

	/*
	 * Ans : only one keyword (extends) are used for the inheritance in Interface
	 * 
	 * Ans:interface can inherit other interface by extends keyword but interface
	 * can not inherit regular class or abstract class.
	 * 
	 * 
	 * How many inheritances are possible? ---- An Interface can inherit more then
	 * one Interface(separated by comma)
	 */
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {

	}

	public static void library() {

	}

	// ---------------------------------

	/*
	 * i) How many keywords are used for the inheritance in Interface, --> extends
	 * keywords
	 * 
	 * Can an interface inherit other Interfaces, --> yes
	 * 
	 * Can an interface inherit a regular class --> no
	 * 
	 * Can an interface inherit a abstract class by extends keyword? --> no
	 * 
	 * How many inheritances are possible? --> one or more
	 * 
	 * public interface University extends College, Hospital, VocationalSchool
	 */
}
