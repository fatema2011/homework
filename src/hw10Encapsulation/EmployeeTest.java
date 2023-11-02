package hw10Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setName("Fatema");
		employee.setAge(30);
		employee.setSex('F');
		employee.setUsCitizen(true);

		System.out.println(" My name is " + employee.getName() + "\nI am " + employee.getAge() + "years old"
				+ "\nMy Gender " + employee.getSex() + " My citizenship status: " + employee.isUsCitizen());

	}

}
