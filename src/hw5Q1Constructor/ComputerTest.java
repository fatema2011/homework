package hw5Q1Constructor;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer = new Computer(); // default constructor initialized

		Computer computer1 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);

		Computer computer2 = new Computer("HP", "ENVY 600", 750, 'B', true);

	}

}
