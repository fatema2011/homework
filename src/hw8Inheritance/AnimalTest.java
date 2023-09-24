package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		
		mammal.animalInfo();

		Reptile reptile = new Reptile();
		reptile.reptileInfo();

		reptile.animalInfo();
		
		
		Birds birds = new Birds();
		birds.birdsInfo();
		
		birds.animalInfo();

		Dog dog = new Dog();
		dog.dogInfo();
		
		dog.mammalInfo();
		dog.animalInfo();

		Snake snake = new Snake();
		snake.snakeInfo();
		
		snake.reptileInfo();
		snake.animalInfo();

		Robin robin = new Robin();
		robin.robinInfo();
		
		robin.birdsInfo();
		robin.animalInfo();

		BullDog bulldog = new BullDog();
		bulldog.bullDogInfo();
		
		bulldog.dogInfo();
		bulldog.mammalInfo();
		bulldog.animalInfo();

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

// Robin is the child Class and Birds is the parent Class
		
		//
		
		
		/*
		 * 
		 * Now extends BullDog, Cobra, and Robin class to their parent's class and 
		 * 
		 * show their hierarchy to Animal Class, for example, bulldog -- dog -- mammal --Animal, Cobra -- snake--reptile--Animal, Robin -- Bird -- Animal, etc. 
		 * 
		 * 
		 * We know, An object Can call other methods if the class is extended, if yes, show all the possible calls. 
		 * 
		 * 
		 * Use Java comments to show single inheritance, multilevel inheritance, and Hierarchical inheritance by example from the above. Also, as shown by java comments who is the Parent class, and who is the child class for at least one class? Organize the code.
		 * 
		 * 
		 * 
		 * */

	}

}
