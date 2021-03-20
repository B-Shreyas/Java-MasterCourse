package day6.assignment;

abstract class Animal {

	abstract void makeSound();

	public void eat() {
		System.out.println("Dog can eat.");
	}
}

class Dog extends Animal {

	// provide implementation of abstract method
	public void makeSound() {
		System.out.println("Bark bark");
	}
}

class Main {
	public static void main(String[] args) {

		// created an object of Dog class
		Dog d1 = new Dog();

		d1.makeSound();
		d1.eat();
	}

}

//Explaination:

// So abstract class means Parent class is Animal. We had made the method makeSounds() as Abstract. 
// And we are calling the abstact method of parent class in Dog Class i.e subclass of abstract class. 
// So, Class Dog which is subclass extending the parent class named Animal.

// In short why we make the class abstract i.e for data hiding or extracting the essntial details or methods only.
