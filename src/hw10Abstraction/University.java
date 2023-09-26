package hw10Abstraction;

public interface University extends College, Hospital{

	
	//
	public void classSize();

	public void playGround();

	public void teacher();
	
	

	public default void gymnasium() {

	}

	public static void library() {

	}


	
	
	

	
	
	
	
	
	
	
	
	//---------------------------------
	
	

	/*
	 * i) How many keywords are used for the inheritance in Interface, 
	 -->  extends keywords

	 * Can an interface inherit other Interfaces, 
	 * --> yes
	 * 
	 *  Can an interface inherit a regular class 
	 *  --> no
	 *  
	 * Can an interface inherit a  abstract class by extends keyword? 
	 * --> no
	 * 
	 *  How many inheritances are possible? 
	 *  --> one or more
	 *  
	 *  public interface University extends College, Hospital, VocationalSchool 
	 * */
}
