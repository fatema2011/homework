package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal(); // single inheritance
		animal.animalInfo();

		Mammal mammal = new Mammal(); // hierarchical inheritance
		mammal.mammalInfo();

		mammal.animalInfo();

		Reptile reptile = new Reptile(); // hierarchical inheritance
		reptile.reptileInfo();

		reptile.animalInfo();

		Birds birds = new Birds(); // hierarchical inheritance
		birds.birdsInfo();

		birds.animalInfo();

		Dog dog = new Dog(); // multilevel inheritance
		dog.dogInfo();

		dog.mammalInfo();
		dog.animalInfo();

		Snake snake = new Snake(); // multilevel inheritance
		snake.snakeInfo();

		snake.reptileInfo();
		snake.animalInfo();

		Robin robin = new Robin(); // multilevel inheritance
		robin.robinInfo();

		robin.birdsInfo();
		robin.animalInfo();

		BullDog bulldog = new BullDog(); // multilevel inheritance
		bulldog.bullDogInfo();

		bulldog.dogInfo();
		bulldog.mammalInfo();
		bulldog.animalInfo();

		Cobra cobra = new Cobra(); // multilevel inheritance
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

// Robin is the child Class and Birds is the parent Class

		// Bulldog is the child class and dog is the parents class
		// Mammal is the child class and animal is the parents class
		// Cobra is the child class and snake is the parents class
		// Snake is the child class and reptile is the parents class
		// Robin is the child class and birds is the parents class
		// Birds is the child class and animal is the parents class

	}

}
