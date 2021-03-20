package mock;

public class InheriMain {

	public static void main(String[] args) {

		InheriAnimal animal = new InheriAnimal("Dog", 4, 2, 30.0);
		animal.eat();
		
		InheriDog dog = new InheriDog("Sheru", 4, 2, 40.0, 2, "Sheru", "Black");
		dog.showDogDetails();

	}

}
